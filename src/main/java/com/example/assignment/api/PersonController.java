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
	public ModelAndView addPerson(String id, String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		if(id.length()==0 || name.length()==0)
			mv.addObject("response","Invalid Values");
		else {
		Person person = new Person();
		person.setId(Integer.valueOf(id));
		person.setName(name);
		String response = personService.addPerson(person);
		mv.addObject("response",response);
		}
		return mv;
	}
}
