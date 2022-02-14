package com.npci.crudproject.service;

import java.util.List;

import com.npci.crudproject.entity.Users;

public interface UserService {
	
	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	public Users addOrUpdateUser(Users user);
	public Users deleteUser(int userId) throws Exception;
	
}
