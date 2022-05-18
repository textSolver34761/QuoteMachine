package com.quotemachine.QuoteMachine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Quotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String author, quote;
	
}
