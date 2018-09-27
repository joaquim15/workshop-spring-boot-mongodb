package br.com.cursoudemy.dto;

import java.io.Serializable;

import br.com.cursoudemy.domain.User;

public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;

	public AuthorDTO() {
		// TODO Auto-generated constructor stub
	}

	public AuthorDTO(User obj) {
		this.id = obj.getId();
		this.name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}