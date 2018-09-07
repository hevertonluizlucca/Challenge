package br.com.hevertonluizlucca.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.hevertonluizlucca.challenge.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.service.getUsers());
		return "user";
	}

	@PostMapping(value = "/user")
	public String usersFiltered(@RequestParam("filter") String filter, Model model) {
		model.addAttribute("usersList", service.getUsersByFilter(filter));
		return "user";
	}

}
