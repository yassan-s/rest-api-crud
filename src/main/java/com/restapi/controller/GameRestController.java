package com.restapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Game;
import com.restapi.form.GameForm;
import com.restapi.service.GameService;

@RestController
public class GameRestController {

	private GameService gameService;

	// @Autowired 省略可
	public GameRestController(GameService gameService) {
		this.gameService = gameService;
	}

	// 全件検索
	@GetMapping("/games")
	public ResponseEntity<List<Game>> gamesAll() {
		return ResponseEntity.ok(gameService.findAllGames());
	}

	// id指定検索
	@GetMapping("/games/{id}")
	public ResponseEntity<Game> gameFindById(@PathVariable("id") int id) {
		return ResponseEntity.ok(gameService.gameFindById(id));
	}

	// タイトルとジャンル指定検索
	@GetMapping("/games/search")
	public ResponseEntity<List<Game>> findByTitleGenre(
			@RequestParam("title") String title,
			@RequestParam("genre") String genre) {
		return ResponseEntity.ok(gameService.findByTitleGenre(title, genre));
	}

	// タイトルとジャンル指定検索(POST)
	@PostMapping("/games/search")
	public ResponseEntity<List<Game>> findByTitleGenre(
			@RequestBody GameForm gameForm) {
		return ResponseEntity.ok(gameService.findByTitleGenre(gameForm.getTitle(), gameForm.getGenre()));
	}
}
