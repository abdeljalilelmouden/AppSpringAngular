package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.entities.Formation; 

@RepositoryRestResource
@CrossOrigin("*")
public interface FormationRepository extends JpaRepository<Formation, Long>{

}
