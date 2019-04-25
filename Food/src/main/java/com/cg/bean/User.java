package com.cg.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class User {
	@Id
	@Column(name = "userName", unique = true, columnDefinition = "VARCHAR(50)")
	private String username;
	private String password;
	private String name;
	private String email;
	private String contact;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [ username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", contact=" + contact + "]";
	}

}
