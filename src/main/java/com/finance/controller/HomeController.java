package com.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Aarav Finance- Home");
		return "index";
	}
	
	@GetMapping("/admin_panel")
	public String admin() {
		return "adminD";
	}
}
