package com.ema.exercise.boycontroller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoyController {
	
	@GetMapping("/boy")
	public String boy (@RequestParam(name = "name", required = false) String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("time", LocalDateTime.now());
		return "boy";
	}
}
