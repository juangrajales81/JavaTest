package co.creativeworks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.creativeworks.models.entity.Project;
import co.creativeworks.models.services.IProjectService;

@RestController
@RequestMapping("/api")
public class ProjectRestController {
	
	@Autowired
	private IProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> index(){
		return projectService.findAll(); 
	}
	
	@GetMapping("/projects/{id}")
	public Project show(@PathVariable Integer id) {
		return projectService.findById(id);
	}
	
	@PostMapping("/projects")
	@ResponseStatus(HttpStatus.CREATED)
	public Project create(@RequestBody Project project) {
		return projectService.save(project);
	}
	
	@PutMapping("/projects/{id}")
	public Project update(@RequestBody Project project, @PathVariable Integer id ) {
		Project actualProject = projectService.findById(id);
		
		actualProject.setDeliveryDate(project.getDeliveryDate());
		actualProject.setFinished(project.isFinished());
		
		return projectService.save(actualProject);
	}
	
	@DeleteMapping("/projects/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id){
		projectService.delete(id);
	}
	
	
	
}
