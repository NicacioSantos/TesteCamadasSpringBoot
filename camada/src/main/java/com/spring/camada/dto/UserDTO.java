package com.spring.camada.dto;

import com.spring.camada.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	
	
	public UserDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public UserDTO(User user) {
		
		id = user.getId();
		name = user.getName();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
