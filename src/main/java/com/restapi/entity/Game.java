package com.restapi.entity;

public class Game {

    private int id;
	private String title;
	private String genre;
	private int price;

	public Game(int id, String title, String genre, int price) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
	}

	public int getId() {
		return id;
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
