package com.engin.model;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty
    private String username;
	@NotEmpty
    private String password;
	@NotEmpty
	private String repassword;

    public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}