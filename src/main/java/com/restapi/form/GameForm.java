package com.restapi.form;

public class GameForm {

	private String title;
	private String genre;
	private int price;

	public GameForm(String title, String genre, int price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public int getPrice() {
		return price;
	}

}
