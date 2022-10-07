package com.example.moviecatalougeservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.moviecatalougeservice.model.Movie;
import com.example.moviecatalougeservice.model.Rating;
import com.example.moviecatalougeservice.model.Catalouge;

@RestController
public class MovieCatalougeController {
	@RequestMapping("/catalog/{userId}")
	public List<Catalouge> getCatalogue(@PathVariable String userId){
		

		List<Rating> ratingsList = Arrays.asList(new Rating("123",4),
				new Rating("5678",3));

		RestTemplate restTemplate = new RestTemplate();


		return ratingsList.stream()
				.map( rating -> {  
				Movie movie = restTemplate.getForObject("http://localhost:8000/movies/4",Movie.class);
					return new Catalouge(movie.getName(),"test",rating.getRating());
				})
				.collect(Collectors.toList());

	}
}
