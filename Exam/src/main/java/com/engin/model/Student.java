package com.engin.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Student extends StudentKey {
	@NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}