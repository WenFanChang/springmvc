package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		// 因為 spring.mvc.view.prefix=/WEB-INF/view/
		//     spring.mvc.view.suffix=.jsp		
		return "hello";  // 會自動指向 /WEB-INF/VIEW/hello.jsp
	}
	
	@GetMapping("/hi")
	public String hi(Model model) {
		model.addAttribute("name", "Tom");
		return "hi";
	}

}
