package com.hc.actions;

import java.io.Console;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	@Override
	public String execute() {
		System.out.println(getUsername() + "  " + getPassword());
		
		return SUCCESS;
	}
	
	private String username;
	private String password;

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
