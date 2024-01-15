package com.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finance.entity.Apply;
import com.finance.entity.Contact;
import com.finance.entity.EmiCalculator;
import com.finance.service.ApplyService;
import com.finance.service.ContactService;

@Controller
public class HomeController {

	@Autowired
	private ApplyService applyService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("title","Aarava Finance - Home");
		return "index";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/service")
	public String service() {
		return "services";
	}

	@GetMapping("/admin_panel")
	public String admin() {
		return "adminD";
	}

	@PostMapping("/saveApp")
	public String saveApp(@ModelAttribute Apply apply) {
		applyService.saveApp(apply);
		return "redirect:/";

	}

	@PostMapping("/calculate")
	public ModelAndView calculateEMI(EmiCalculator emiCalculator, Model model) {
		double loanAmount = emiCalculator.getLoanAmount();
		double interestRate = emiCalculator.getInterestRate() / 100 / 12;
		int loanTerm = emiCalculator.getLoanTerm();

		double emi = (loanAmount * interestRate * Math.pow(1 + interestRate, loanTerm))
				/ (Math.pow(1 + interestRate, loanTerm) - 1);

		ModelAndView modelAndView = new ModelAndView("emiFragment::emiResult");
		modelAndView.addObject("emi", String.format("₹%.2f per month", emi));
		return modelAndView;
	}

}
