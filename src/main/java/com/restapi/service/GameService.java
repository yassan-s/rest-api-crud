package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.Game;
import com.restapi.mapper.GameMapper;

@Service
public class GameService {

	@Autowired
	private GameMapper gameMapper;

	public GameService(GameMapper gameMapper) {
		this.gameMapper = gameMapper;
	}

	public List<Game> findAllGames(){
		return gameMapper.findAll();
	}
}
