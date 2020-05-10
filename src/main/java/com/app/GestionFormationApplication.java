package com.app;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.app.dao.FormationRepository; 
import com.app.entities.Formation;

@SpringBootApplication
public class GestionFormationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionFormationApplication.class, args);
	}
	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Formation.class);
		formationRepository.save(new Formation(null, "Devenez développeur d'applications avec Java, l'un des langages les plus utilisés au monde.", "java jee et angular", "Abdeljalil", new Date(), new Date(), "200DH"));
		formationRepository.save(new Formation(null, "description", "php", "Abdeljalil", new Date(), new Date(), "200DH"));
		formationRepository.save(new Formation(null, "description", "oracle", "Abdeljalil", new Date(), new Date(), "200DH"));
		formationRepository.save(new Formation(null, "description", "big data", "Abdeljalil", new Date(), new Date(), "200DH"));
		formationRepository.save(new Formation(null, "description", "python", "Abdeljalil", new Date(), new Date(), "200DH"));
		
	}

}
