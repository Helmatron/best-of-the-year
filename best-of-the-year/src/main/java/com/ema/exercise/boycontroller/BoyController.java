package com.ema.exercise.boycontroller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoyController {

	@GetMapping("/boy")
	public String boy(@RequestParam(name = "name", required = false) String name, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("date", LocalDate.now());

		// metodo per formattare l'ora
		String formattedTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

		// Aggiungo l'ora formattata al modello
		model.addAttribute("time", formattedTime);

		return "boy";
	}

}
