package com.example.Saurabh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {
	@RequestMapping("/")
	public String redirect(Model model) {
		model.addAttribute("message", "Saurabh Jain");
		return "saurabh";
	}
}