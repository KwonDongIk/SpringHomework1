package com.yedam.ex03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("restaurant")
public class Restaurant{
	
	@Autowired
	private Chef chef;

	public Chef getChef() {
		return chef;
	}

}
