package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Game;
import com.restapi.service.GameService;

@RestController
public class GameRestController {

	@Autowired
	private GameService gameService;

	public GameRestController(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping("/api/games")
	public List<Game> gameAll() {
		return gameService.findAllGames();
	}

}