package com.quotemachine.QuoteMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quotemachine.QuoteMachine.model.Quotes;
import com.quotemachine.QuoteMachine.repo.QuoteMachineRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuoteController {

	@Autowired
	QuoteMachineRepo repo;
	
	@GetMapping("/quotes")
	public List<Quotes>getQuotes(){
		return (List<Quotes>) repo.findAll();
	}
	
	@GetMapping("/save-quotes")
	public Quotes save(@RequestBody Quotes quotes){
		return repo.save(quotes);
	}
	
}
