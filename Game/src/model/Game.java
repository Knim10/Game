package model;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Sep 5, 2023
 */
public class Game {
	
	private String name;
	private String genre;
	private String publisher;
	private String developer;
	private int publishYear;
	private double price;
	
	public Game() {
		setName(null);
		setGenre(null);
		setPublisher(null);
		setDeveloper(null);
		setPublishYear(0);
		setPrice(0);
	}
	
	public Game(String name, String genre, String publisher, String developer, int publishYear, double price) {
		setName(name);
		setGenre(genre);
		setPublisher(publisher);
		setDeveloper(developer);
		setPublishYear(publishYear);
		setPrice(price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	public void setPublishYear(int year) {
		this.publishYear = year;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public String getDeveloper() {
		return this.developer;
	}
	
	public int getPublishYear() {
		return this.publishYear;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Genre: " + getGenre() + ", Publisher: " + getPublisher() + ", Developer: " + getDeveloper() + ", Publish Year: " + getPublishYear() + ", Price: $" + getPrice();
	}

}
