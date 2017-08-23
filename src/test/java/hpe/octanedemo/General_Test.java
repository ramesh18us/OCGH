package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import hpe.octanedemo.General;

public class General_Test{
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;
	 
	@Test
	public void General_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		General.dummycode(randomNumber);
		General.fibonacciRecusion(randomNumber);
	}
 
	
	@Test
	public void General_Negative_Test() {
		
		General.fibonacciLoop(randomNumber);

	}

}

