package com.lagosjug.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Home {

	@RequestMapping("/")
	public ModelAndView home (Model model) {
		model.addAttribute("message", "hello world");
		return new ModelAndView("home");
	}
}
