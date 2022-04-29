package com.spring.camada.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.camada.dto.UserDTO;
import com.spring.camada.entities.User;
import com.spring.camada.repositories.UserRepository;

@Service
public class UserService {
	 @Autowired
	 UserRepository repository;	
	 
	public UserDTO findyId(Long id) {
		
		User user = repository.findById(id).get();
	    UserDTO dto = new UserDTO(user);
	    return dto;
	}

}
