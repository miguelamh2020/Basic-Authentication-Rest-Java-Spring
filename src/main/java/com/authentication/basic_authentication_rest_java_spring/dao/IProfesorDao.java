package com.authentication.basic_authentication_rest_java_spring.dao;

import com.authentication.basic_authentication_rest_java_spring.entity.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface IProfesorDao extends CrudRepository<Profesor, Long> {

}
