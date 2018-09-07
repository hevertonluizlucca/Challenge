package br.com.hevertonluizlucca.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hevertonluizlucca.challenge.entity.User;
import br.com.hevertonluizlucca.challenge.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository reposytory;

	public List<User> getUsers() {
		return this.reposytory.findAll();
	}
	
	public List<User> getUsersByFilter(String filter) {
		return this.reposytory.findbyFilterParam(filter);
	}
	
}
