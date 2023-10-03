package com.calculate.chuseok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculateController {

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String showCalculator(Model model) {
	    return "form";
	}
}
