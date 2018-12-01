package com.fiap.aoj.ms.basicMs.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fiap.aoj.ms.basicMs.entity.Microservico;
import com.fiap.aoj.ms.basicMs.entity.Sistema;

public interface IMicroservicoService {
    
	Microservico create(Microservico microservico);
	Microservico get(Long id);
	Microservico edit(Microservico microservico);
    void delete(Microservico microservico);
    void deleteById(Long id);
    List getAll();
    long count();

}
