package com.example.assignment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.assignment.model.Person;
import com.example.assignment.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		mv.addObject("response", "");
		return mv;
	}
	
	@PostMapping("/addPerson")
	public ModelAndView addPerson(String name, String adhar) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		String response = personService.addPerson(name, adhar);
		mv.addObject("response",response);
		return mv;
	}
}
