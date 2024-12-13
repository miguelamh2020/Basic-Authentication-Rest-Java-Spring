package com.authentication.basic_authentication_rest_java_spring.service;

import com.authentication.basic_authentication_rest_java_spring.dao.IProfesorDao;
import com.authentication.basic_authentication_rest_java_spring.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("profesorService")
public class ProfesorServiceImpl implements IProfesorService {
	
	@Autowired
	private IProfesorDao profesorDao;

	@Override
	public List<Profesor> findAllProfessors() {
		return (List<Profesor>) profesorDao.findAll();
	}

}
