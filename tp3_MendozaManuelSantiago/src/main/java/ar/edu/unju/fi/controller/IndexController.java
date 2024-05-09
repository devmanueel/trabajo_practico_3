package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping({"/index","/home","/","/inicio"}) //indica en la raiz del servidor
	
	public String getIndex() {
		return "index";
	}
}
