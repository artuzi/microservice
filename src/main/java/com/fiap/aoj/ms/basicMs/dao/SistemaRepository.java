package com.fiap.aoj.ms.basicMs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fiap.aoj.ms.basicMs.entity.Sistema;


@Repository
public interface SistemaRepository extends CrudRepository<Sistema, Long> { 
    
}
