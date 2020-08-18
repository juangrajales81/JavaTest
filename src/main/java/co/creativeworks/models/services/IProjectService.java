package co.creativeworks.models.services;

import java.util.List;

import co.creativeworks.models.entity.Project;

public interface IProjectService {
	
	
	public List<Project> findAll();
	
	public Project save(Project project);
	
	public Project findById(Integer id);
	
	public void delete(Integer id);

}
