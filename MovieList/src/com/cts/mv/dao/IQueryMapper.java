package com.cts.mv.dao;

public interface IQueryMapper {

	public static final String ADD_MOVIE_QRY = 
			"INSERT INTO movies(mvid,  mvname, mvhero,rdate,collection) VALUES(?,?,?,?,?)";
	public static final String MODIFY_MOVIE_QRY = 
			"UPDATE movies SET mvid=?,mvname=?,mvhero=?,rdate=?,collection=? WHERE mvid=?";
	public static final String DEL_MOVIE_QRY = 
			"DELETE FROM movies WHERE mvid=?";
	public static final String GET_ALL_MOVIE_QRY = 
			"SELECT * FROM movies";
	public static final String GET_MOVIE_QRY = 
			"SELECT * FROM movies WHERE mvid=?";
}