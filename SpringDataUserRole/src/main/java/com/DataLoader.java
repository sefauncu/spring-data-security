package com;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.Role;
import com.domain.User;
import com.repository.RoleRepository;
import com.repository.UserRepository;

@Component
public class DataLoader {
	/*
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	
	@Autowired
	public DataLoader(UserRepository userRepository, RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}
	
	@PostConstruct
	private void loadData(){
		
		User user1 = new User("sefa", "sefa@sefa.com", "123456");
		
		Role role1 = new Role("ADMIN");
		Role role2 = new Role("USER");
	
		roleRepository.save(role1);
		roleRepository.save(role2);
		
		
		user1.getRoles().add(role1);
		user1.getRoles().add(role2);
		
		
		
		userRepository.save(user1);
		
		
				
	}
	*/
}
