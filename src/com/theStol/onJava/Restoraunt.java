package com.theStol.onJava;

public class Restoraunt {

	private String name;
	private int rating;
	private String description;
	
	public Restoraunt(String name, int rating, String description) {
		super();
		this.name = name;
		this.rating = rating;
		this.description = description;
	}
	

	public Restoraunt() {
		super();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
