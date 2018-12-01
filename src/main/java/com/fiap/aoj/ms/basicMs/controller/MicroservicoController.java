package com.fiap.aoj.ms.basicMs.controller;

import java.util.List;

import javax.persistence.Column;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.aoj.ms.basicMs.dao.IMicroservicoService;
import com.fiap.aoj.ms.basicMs.entity.Microservico;

@RestController
@RequestMapping("/microservico")
public class MicroservicoController {

	Logger logger = LoggerFactory.getLogger(MicroservicoController.class);	

	@Autowired
	private IMicroservicoService microservicoService;	
	
	
	@RequestMapping(method = RequestMethod.POST, value="/insert")
	public ResponseEntity<Microservico> insertMicroservico(@RequestBody Microservico microservico) {
		
		microservicoService.create(microservico);
		logger.info("Insert processado " + microservico.getNome());
		
		return new ResponseEntity<>(microservico,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/update/{id}")
	public ResponseEntity<Void> updateMicroservico(@PathVariable Long id,@RequestBody Microservico microservico) {
		
		
		Microservico oldMicroservico = microservicoService.get(id);
		oldMicroservico.setNome(microservico.getNome() );
		oldMicroservico.setEndPoint(microservico.getEndPoint());
		oldMicroservico.setContainer(microservico.getContainer());
		oldMicroservico.setVersao(microservico.getVersao());
		oldMicroservico.setBanco(microservico.getBanco());
		oldMicroservico.setAtivo(microservico.getAtivo());
		microservicoService.edit(oldMicroservico);
		
		logger.info("Update processado " + microservico.getNome());
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	
	@GetMapping("/get/{id}")
	public ResponseEntity<Microservico> getMicroservico(@PathVariable Long id) {
		
		Microservico microservico = null;
		
		try {
			microservico = microservicoService.get(id);
			logger.info("get processado " + microservico.getNome());
		} catch (Exception e) {
			logger.error("Nao encontrato " + id);
			return new ResponseEntity<>(microservico,HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(microservico,HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<Void> deleteMicroservico(@PathVariable Long id) {
		
		microservicoService.deleteById(id);
		logger.info("delete processado " + id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public List<Microservico> getAll() {
		logger.info("retornando todos os microservicos");
		return microservicoService.getAll();
	}
}
