package com.service;

import java.util.List;

import com.domain.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findOne(int id);
	
	public User addUser(User user);
	
	public void deleteUser(int id);
	
	public User findByEmail(String email);

}
