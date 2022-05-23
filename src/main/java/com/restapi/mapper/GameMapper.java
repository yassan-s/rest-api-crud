package com.restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.restapi.entity.Game;

@Mapper
public interface GameMapper {

	// 全件取得
	@Select("SELECT * FROM games")
	List<Game> findAll();

	// id指定検索
	@Select("SELECT * FROM games WHERE id = #{id}")
	Game gameFindById(int id);

	// タイトルとジャンル指定検索
	@Select("SELECT * FROM games "
			+ "WHERE title LIKE CONCAT('%', #{title}, '%') "
			+ "AND genre LIKE CONCAT('%', #{genre}, '%')")
	List<Game> findByTitleGenre(@Param("title") String title, @Param("genre")String genre);

}
