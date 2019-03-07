package com.bootjpa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootjpa.demo.dao.AlienRepo;
import com.bootjpa.demo.model.Alien;

@RestController /*All the methods will work for rest*/

public class AlienController {

	/* It will look for the object of Alien Repository */
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	/* Request only for Alien */
	/*@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	*/
	
	/* @RequestMapping*/
	@PostMapping("/alien")
	public Alien  addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	/*@RequestMapping*/
	@GetMapping(path="/aliens")	/*produces={"application/xml"}*/
	//@ResponseBody
	public List<Alien> getAlien()
	{
		/*fetches the list, but doesn't convert to json*/
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	/*It does not return view name it returns actual data*/
	//@ResponseBody
	public 	Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
		//return repo.findById(aid).toString();
		
	}
	
	/* Request only for Alien */
	/*
	 * @RequestMapping("/getAlien") Request Param is used top fetch the value from
	 * the client
	 * 
	 * public ModelAndView getAlien(@RequestParam int aid) { ModelAndView mv = new
	 * ModelAndView("showAlien.jsp"); Alien alien = repo.findById(aid).orElse(new
	 * Alien()); System.out.println(repo.findByTech("Java"));
	 * System.out.println(repo.findByAidGreaterThan(102));
	 * System.out.println(repo.findByTechSorted("Java")); mv.addObject(alien);
	 * return mv; }
	 */

	/*
	 * @RequestMapping("/removealien")
	 * 
	 * public ModelAndView removeAlien (@RequestParam int aid) { ModelAndView mv1 =
	 * new ModelAndView("deleteAlien.jsp"); Alien alien =
	 * repo.deleteById(aid).orElse(new Alien()); mv1.clear();
	 * 
	 * return int; }
	 */

}
