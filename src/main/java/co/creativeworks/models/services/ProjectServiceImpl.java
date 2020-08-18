package co.creativeworks.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.creativeworks.models.dao.IProjectDao;
import co.creativeworks.models.entity.Project;

@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	private IProjectDao projectDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Project> findAll() {
		return (List<Project>) projectDao.findAll();
	}

	@Override
	@Transactional
	public Project save(Project project) {		
		return projectDao.save(project);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Project findById(Integer id) {		
		return projectDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		projectDao.deleteById(id);
		
	}

	

}
