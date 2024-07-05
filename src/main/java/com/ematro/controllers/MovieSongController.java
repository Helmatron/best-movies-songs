package com.ematro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieSongController {
	
	@GetMapping("/songs")
	public String songs() {
		return "songs";
	};
	
	@GetMapping("/movies")
	public String movies() {
		return "movies";
	};
}
