package com.app.WebServiceRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.FormationRepository;
import com.app.entities.Formation; 
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/v1")
public class FormationWebServiceRest {
	
	@Autowired
	private FormationRepository formationRepository;
 
	@GetMapping(path = "/exportationFormationExcel")
	public String ExportationFormationExcel(){
		return "oui";
	}
	
	
	@GetMapping(path = "/list")
	public List<Formation> list(){
		return formationRepository.findAll();
	}
	
	@PostMapping(path = "/add")
	public Formation add(@RequestBody Formation f){
		return formationRepository.save(f);
	}
	
	
	@DeleteMapping(path = "/delete")
	public void delete(@RequestBody Formation f){
		 formationRepository.delete(f);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable Long id){
		 formationRepository.getOne(id);
	}
	
}
