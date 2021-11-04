package com.qa.budgies.domain;

public class Budgie {

	private String name;
	private String colour;
	private String sex;
	
	public Budgie(String name, String colour, String sex) {
		super();
		this.name = name;
		this.colour = colour;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Budgie [name=" + name + ", colour=" + colour + ", sex=" + sex + "]";
	}
	
	
}
