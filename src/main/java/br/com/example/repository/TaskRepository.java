package br.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.example.model.Task;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Integer>{

}
