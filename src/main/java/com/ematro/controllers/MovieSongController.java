package com.ematro.controllers;

import java.util.ArrayList;
import java.util.Arrays;
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
		movies.add(new Movie(01, "Titanic"));
		movies.add(new Movie(02, "Io sono leggenda"));
		movies.add(new Movie(03, "Mad Max: Fury Road"));

		return movies;
	};

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(01, "Dolce Nera"));
		songs.add(new Song(02, "Jodellavitanonhocapitouncazzo"));
		songs.add(new Song(03, "Abiura di me"));

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

	@GetMapping("/songs/{id}")
	public String idPathSongs(@PathVariable("id") int id, Model model) {
		getBestSongs();
		model.addAttribute(model)
		return "song";

	};
}
