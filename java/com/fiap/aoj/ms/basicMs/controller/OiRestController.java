package com.fiap.aoj.ms.basicMs.controller;

import java.net.InetAddress;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.aoj.ms.basicMs.entity.Sistema;


@RestController
@RequestMapping("/api")
public class OiRestController {


		
    
	@RequestMapping(method = RequestMethod.GET, value="/oi", produces = "text/plain")
	public String oi() throws UnknownHostException {
		String hostname = null;
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		} catch ( UnknownHostException e) {
			hostname = "unknown";			
		}
		return "oi do Spring from" + hostname;
	}
	

	
	
}
