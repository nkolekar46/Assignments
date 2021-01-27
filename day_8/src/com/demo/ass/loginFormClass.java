package com.demo.ass;

import java.io.Serializable;

public class loginFormClass implements Serializable{
	private String username;
	private String password;
	
	public loginFormClass() {
		// TODO Auto-generated constructor stub
	}

	public loginFormClass(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

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
	
	

}
