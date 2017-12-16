package br.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.example.model.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Integer>{

}
