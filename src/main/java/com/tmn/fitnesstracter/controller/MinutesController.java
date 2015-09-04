package com.tmn.fitnesstracter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tmn.fitnesstracter.model.Exercise;

@Controller
public class MinutesController {
	@RequestMapping(value="/addMinutes")
	public String addMinutes( @ModelAttribute Exercise exercise){
		
		System.out.println("Execise Minutes: " + exercise.getMinutes());
		
		return "addMinutes";
	}
}
