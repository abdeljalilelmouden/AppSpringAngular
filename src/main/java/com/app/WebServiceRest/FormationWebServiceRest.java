package com.app.WebServiceRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dao.FormationRepository; 
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/v1")
public class FormationWebServiceRest {
	
	@Autowired
	private FormationRepository FormationRepository;
	
	@GetMapping(path = "/exportationFormationExcel")
	public String ExportationFormationExcel(){
		return "oui";
	}
}
