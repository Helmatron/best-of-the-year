package boy.controller;

import java.time.LocalDateTime;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoyController {
	
	@GetMapping("/saluta")
	public String saluta(@RequestParam(name = "nome", required = false) String nome, Model model) {
		model.addAttribute("name", nome);
		model.addAttribute("time", LocalDateTime.now());
		return "boy";
	}
}
