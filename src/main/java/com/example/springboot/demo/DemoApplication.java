package com.example.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public double sommePositive(double a, double b){
		double res=a+b;
		if(res<0){return 0;}
		return res;
	}

}
