package com.restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.restapi.entity.Game;

@Mapper
public interface GameMapper {

	@Select("SELECT * FROM games")
	List<Game> findAll();

}
