package com.hc.actions;

import java.io.Console;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	public LoginAction() {
		// TODO Auto-generated constructor stub
		request = (Map)ActionContext.getContext().get("request");
		
	}
	@Override
	public String execute() {
		request.put("name", "watson");
		System.out.println(getUsername() + "  " + getPassword());
		if (username=="" || username == null) {
			this.addFieldError("username", "name is error");
			return "invalid";
		}
		return SUCCESS;
	}
	
	private Map request;
	
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
