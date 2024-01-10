package com.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finance.entity.Apply;
import com.finance.service.ApplyService;

@Controller
public class HomeController {
	
	@Autowired
	private ApplyService applyService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Aarav Finance- Home");
		return "index";
	}
	
	@GetMapping("/admin_panel")
	public String admin() {
		return "adminD";
	}
	
	@GetMapping("/apply")
	public String apply() {
		return "apply";
	}
	
	@PostMapping("/saveApp")
	public String saveApp(@ModelAttribute Apply apply) {
		applyService.saveApp(apply);
		return "redirect:/";
		
	}
}
