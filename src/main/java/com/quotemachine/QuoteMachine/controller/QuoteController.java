package com.quotemachine.QuoteMachine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.quotemachine.QuoteMachine.model.Quotes;

@Controller
public class QuoteController {
	@PostMapping("/")
	public String showForm(@ModelAttribute("Quotes") Quotes quotes) {
		quotes.setAuthor("");
		quotes.setQuote("");
		return "index";
	}
}
