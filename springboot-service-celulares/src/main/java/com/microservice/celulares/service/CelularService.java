package com.microservice.celulares.service;

import java.util.List;

import com.microservice.celulares.entity.Celular;

public interface CelularService {
	public List<Celular> findAll();
	
	public Celular findById(long id);
	
	public void deleteById(long id);

	public Celular save(Celular instance);
	
	public boolean existsById(long id);
}
