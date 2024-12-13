package com.authentication.basic_authentication_rest_java_spring.controller;

import com.authentication.basic_authentication_rest_java_spring.entity.Profesor;
import com.authentication.basic_authentication_rest_java_spring.service.ProfesorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfesorRestController {

	@Autowired
	ProfesorServiceImpl profesorService;
	
	@RequestMapping(value = "/todos_profesores_public", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listAllProfessor(){
		List<Profesor> profesores = profesorService.findAllProfessors();
		if(profesores.isEmpty()){
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/todos_profesores_admin", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listAllProfessoradmin(){
		List<Profesor> profesores = profesorService.findAllProfessors();
		if(profesores.isEmpty()){
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/todos_profesores_user", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listAllProfessorAdmin(){
		List<Profesor> profesores = profesorService.findAllProfessors();
		if(profesores.isEmpty()){
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
	}
	
}
