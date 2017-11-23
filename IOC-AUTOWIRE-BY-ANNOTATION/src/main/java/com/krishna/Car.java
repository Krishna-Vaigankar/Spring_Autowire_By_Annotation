package com.krishna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Qualifier(value = "e")
	@Autowired
	private Engine engine;

	public void show() {
		System.out.println(engine.getModelyear());
	}
}
