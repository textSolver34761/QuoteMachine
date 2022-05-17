package com.quotemachine.QuoteMachine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.quotemachine.QuoteMachine.model.Quotes;

@Controller
public class QuoteController {
	
	List<Quotes> quoteList = new ArrayList<Quotes>();
	
	@GetMapping("/")	
	public String showForm(Model model) {
		Quotes quotes = new Quotes();
		model.addAttribute("Quotes", quotes);
		quotes.setAuthor("");
		quotes.setQuote("");
		return "index";
	}
	
	@PostMapping("/")
	public String display(@ModelAttribute("Quotes") Quotes quotes) {
		quoteList.add(quotes);
		System.out.println("LIST " + quotes);
		return "index";
	}
}
