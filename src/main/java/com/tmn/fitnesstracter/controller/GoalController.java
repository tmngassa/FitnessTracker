package com.tmn.fitnesstracter.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tmn.fitnesstracter.model.Goal;

@SessionAttributes("goal")
@Controller
public class GoalController {
	@RequestMapping(value="/addGoal", method=RequestMethod.GET)
	public String addGoal( Model model){
		model.addAttribute("goal", new Goal());
		
		return "addGoal";
	}
	
	@RequestMapping(value="addGoal", method=RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){
		
		System.out.println("Result has errors: " + result.hasErrors());
		
		System.out.println("Minutes updated: " + goal.getMinutes());
		
		if(result.hasErrors()){
			return "addGoal";
		}else{
			return "redirect:addMinutes";			
		}
	}
}
