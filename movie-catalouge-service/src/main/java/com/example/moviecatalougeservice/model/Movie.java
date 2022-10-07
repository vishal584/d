package com.example.moviecatalougeservice.model;

public class Movie {
	String movieId;
	String name;

	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie() {

	}
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
}
