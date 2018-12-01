package com.fiap.aoj.ms.basicMs.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.aoj.ms.basicMs.entity.Microservico;
import com.fiap.aoj.ms.basicMs.entity.Sistema;

@Service
public class MicroservicoService implements IMicroservicoService {


	@Autowired
    private MicroservicoRepository microservicoRepository;

    
	@Override
	public Microservico create(Microservico microservico) {
		return microservicoRepository.save(microservico);
	}

	@Override
	public Microservico get(Long id) {
		
		return microservicoRepository.findById(id).get();
		
	}

	@Override
	public Microservico edit(Microservico microservico) {
		return microservicoRepository.save(microservico);
	}

	@Override
	public void delete(Microservico microservico) {
		microservicoRepository.delete(microservico);
	}

	@Override
	public void deleteById(Long id) {
		Microservico microservico = microservicoRepository.findById(id).get();
		microservicoRepository.delete(microservico);		
	}	
	
	@Override
	public long count() {
		return microservicoRepository.count();
	}
	
	
	@Override
	public List getAll() {

		Iterable<Microservico> microservicos = microservicoRepository.findAll();
		
		return (List) microservicos;
		
	}
    
   
}
