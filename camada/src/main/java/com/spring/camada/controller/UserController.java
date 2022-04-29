package com.spring.camada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.camada.dto.UserDTO;
import com.spring.camada.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
    @Autowired
	private UserService service;
	
    @GetMapping(value = "/{id}")
	public UserDTO findyId( @PathVariable Long id) {

		return service.findyId(id);

	}

}
