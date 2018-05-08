package com.service;

import java.util.List;

import com.domain.Role;

public interface RoleService {
	
	public List<Role> findAll();
	
	public Role findOne(int id);
	
	public Role addRole(Role role);
	
	public void deleteRole(int id);
	
	
}
