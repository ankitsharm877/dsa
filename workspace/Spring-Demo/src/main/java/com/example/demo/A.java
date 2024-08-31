package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	B b;
	
	@Autowired
    public A(@Lazy B b) {
        this.b = b;
    }
	
	public B getB() {
		return b;
	}
	

}
