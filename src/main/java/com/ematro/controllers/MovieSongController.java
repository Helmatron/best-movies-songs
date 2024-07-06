package com.ematro.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ematro.models.Movie;

@Controller
public class MovieSongController {
	
	
	
	@GetMapping("/songs")
	public String songs(String song, Model model) {
		
		
		
		return "songs";
	};
	
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAllAttributes(getBestMovies());
		return "movies";
	};
}
