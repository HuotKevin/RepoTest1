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
		if(res==0){
			if(res==-1){
				if(res==-2){
					if(res==-3){
						if(res==-4){
							if(res==-5){
								if(res==-6){
									if(res==-7){
										if(res==-8){
											if(res==-9){
												if(res==-10){
													if(res==-11){
														return -12;
													}
													return 0;
												}
												return 0;
											}
											return 0;
										}
										return 0;
									}
									return 0;
								}
								return 0;
							}
							return 0;
						}
						return 0;
					}
					return 0;
				}
				return 0;
			}
			return 0;
		}
		return res;
	}
}
