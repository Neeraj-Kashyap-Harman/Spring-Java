package com.bootjpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootjpa.demo.dao.AlienRepo;
import com.bootjpa.demo.model.Alien;

@Controller
public class AlienController {

	/*It will look for the object of Alien Repository*/
	@Autowired
	AlienRepo repo;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	/*Request only for Alien*/
	@RequestMapping("addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
}
