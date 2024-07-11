package com.ematro.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ematro.models.Movie;
import com.ematro.models.Song;

@Controller
public class MovieSongController {

	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "Titanic"));
		movies.add(new Movie(2, "Io sono leggenda"));
		movies.add(new Movie(3, "Mad Max: Fury Road"));

		return movies;
	};

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(1, "Dolce Nera"));
		songs.add(new Song(2, "Jodellavitanonhocapitouncazzo"));
		songs.add(new Song(3, "Abiura di me"));

		return songs;
	};

	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("songs", getBestSongs());
		return "songs";
	};

	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("movies", getBestMovies());
		return "movies";
	};
	

	/* RICERCA PER ID - Movie */

	public Movie getMovieById(int id) {
		for (Movie m : getBestMovies()) {
			if (m.getId() == (id)) {
				return m;
			}
		}
		return null;
	};

	@GetMapping("/movies/{id}")
	public String findMovieById(@PathVariable("id") int id, Model model) {
		Movie movie = getMovieById(id);
		model.addAttribute("movie", movie);
		model.addAttribute("findMovieById", true);
		return "movies";
	};
	
	
	/* RICERCA PER ID - Song */

	public Song getSongById(int id) {
		for (Song s : getBestSongs()) {
			if (s.getId() == (id)) {
				return s;
			}
		}
		return null;
	};

	@GetMapping("/songs/{id}")
	public String findSongById(@PathVariable("id") int id, Model model) {
		Song song = getSongById(id);
		model.addAttribute("song", song);
		model.addAttribute("findSongById", true);
		return "songs";
	};

}
