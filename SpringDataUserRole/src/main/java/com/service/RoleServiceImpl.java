package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Role;
import com.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	private RoleRepository roleRepository;
	
	@Autowired
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Role> findAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(int id) {
		
		return roleRepository.getOne(id);
	}

	@Override
	public Role addRole(Role role) {
		
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(int id) {
		
		roleRepository.deleteById(id);
		
	}

}
