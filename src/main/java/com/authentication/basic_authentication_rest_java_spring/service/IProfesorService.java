package com.authentication.basic_authentication_rest_java_spring.service;

import com.authentication.basic_authentication_rest_java_spring.entity.Profesor;

import java.util.List;

public interface IProfesorService {

	List<Profesor> findAllProfessors();
	
}
