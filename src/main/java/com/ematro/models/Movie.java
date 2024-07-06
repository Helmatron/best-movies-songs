package com.ematro.models;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private int id;
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();
		
		Movie movie1 = new Movie();
		movie1.setId(1);
		movie1.setTitle("Chi ha incastrato Roger Rabbit");
		
		Movie movie2 = new Movie();
		movie2.setId(2);
		movie2.setTitle("Big Fish");
		
		Movie movie3 = new Movie();
		movie3.setId(3);
		movie3.setTitle("La spada nella roccia");
		
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		
		return movies;
	} 
}
