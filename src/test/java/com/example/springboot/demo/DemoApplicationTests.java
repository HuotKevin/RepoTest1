package com.example.springboot.demo;

//import java.beans.Transient;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DemoApplicationTests {

	DemoApplication objT=new DemoApplication();

	@Test
	public void contextLoads() {
	}

	@Test
	public void testsommePositive1(){
		double arg1=0.4;
		double arg2=7.3;
		double resPrevu=7.7;
		
		assertEquals(objT.sommePositive(arg1,arg2),resPrevu,1e-15);
	}

}
