package com.cos.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {
	
	@GetMapping("/tmep/jsp")
	public String tempJSP() {
		return "test";
	}
}
