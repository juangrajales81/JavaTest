package co.creativeworks.models.dao;

import org.springframework.data.repository.CrudRepository;

import co.creativeworks.models.entity.Project;

public interface IProjectDao extends CrudRepository<Project, Integer>{

}
