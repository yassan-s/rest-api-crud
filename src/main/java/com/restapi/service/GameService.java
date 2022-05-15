package com.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.entity.Game;
import com.restapi.mapper.GameMapper;

@Service
public class GameService {

	private GameMapper gameMapper;

	// @Autowired 省略可
	public GameService(GameMapper gameMapper) {
		this.gameMapper = gameMapper;
	}

	// 全件取得
	public List<Game> findAllGames(){
		return gameMapper.findAll();
	}

	// id指定検索
	public Game gameFindById(int id){
		return gameMapper.gameFindById(id);
	}

	// タイトルとジャンル指定検索
	public List<Game> findByTitleGenre(String title, String genre){
		return gameMapper.findByTitleGenre(title, genre);
	}
}
