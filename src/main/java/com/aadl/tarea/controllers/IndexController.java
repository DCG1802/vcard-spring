package com.aadl.tarea.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

	@RequestMapping("/ver")
	public String index() {
		return "index";
	}
}
