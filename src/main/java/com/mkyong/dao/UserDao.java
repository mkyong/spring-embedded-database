package com.mkyong.dao;

import java.util.List;

import com.mkyong.model.User;

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}