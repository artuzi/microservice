package com.fiap.aoj.ms.basicMs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fiap.aoj.ms.basicMs.entity.Microservico;


@Repository
public interface MicroservicoRepository extends CrudRepository<Microservico, Long> { 
	
	/*
	 @Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
	    List<Article> fetchArticles(@Param("title") String title, @Param("category") String category);
   */
	
}
