package com.hccs.adweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SpringTestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewStudentDetails(ModelMap model) {
	    model.addAttribute("greetings", "Hi, I am Nicholas Spring Framework, Glad to meet you :) !!!!");
	    return "hello";
	}
	
	@RequestMapping(value = "/fine", method = RequestMethod.GET)
	public String viewStudentDetails2(ModelMap model) {
		System.out.println("-----------Came inside my controller ----------");
	    model.addAttribute("greetingsFine", "I am doing Fine Excellent, THanks !!!!");
	    return "fine";
	}
	
	
	@RequestMapping(value = "/studentslist", method = RequestMethod.GET)
	public ModelAndView viewStudentList() {
		System.out.println("-----------Came inside my controller for picking up students list ----------");
	    ArrayList<Student> studentsList = StudentsList.getStudentsList();
	    
	    return new ModelAndView("studentslist","studentsList", studentsList);
	}
}
