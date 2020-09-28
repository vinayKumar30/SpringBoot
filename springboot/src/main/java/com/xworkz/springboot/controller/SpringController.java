package com.xworkz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SpringController {

	public SpringController() {
		System.out.println("Created : " + this.getClass().getSimpleName());
	}

	@RequestMapping("/onAction")
	public String onAction() {
		System.out.println("Invoked onAction");
		return "index";
	}

	@RequestMapping("/input.do")
	public String theMessage(String from, String message, Model model) {

		System.out.println("Invoked theMessage()");
		try {
			model.addAttribute("from", from);
			model.addAttribute("message", message);
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
		return "displayMessage";
	}
}
