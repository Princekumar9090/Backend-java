package com.erp.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.web.model.Model123;
import com.erp.web.repository.MongoDB123;

@RestController
public class Controller123 {
	
@Autowired
private MongoDB123 mongodb123;

@RequestMapping(value = "/getEmployees", method = RequestMethod.POST)
public Model123 addEntry(@Valid @RequestBody Model123 model123){
	Model123 allEMployees = mongodb123.save(model123);
    return allEMployees;
}
}

//@ResponseBody
//public ResponseEntity<String> addEntry(@RequestBody Model123 model123) {
////	Model123 allEMployees = mongodb123.save(model123);
////	return allEMployees;
//	return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("John doe failed you");
//	
//
//}






	
	









