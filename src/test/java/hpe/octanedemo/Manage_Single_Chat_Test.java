package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import hpe.octanedemo.Manage_Single_Chat;

public class Manage_Single_Chat_Test{
			
	Random ran = new Random();
	int range = 6;
	int randomNumber = ran.nextInt(range) + 1;
	
	//int totalNumber = 20;
	 
	@Test
	public void Manage_Single_Chat_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Manage_Single_Chat.dummycode(randomNumber);
		Manage_Single_Chat.fibonacciRecusion(randomNumber);
	}
	 
	@Test
	public void Manage_Single_Chat_Negative_Test() {
		Manage_Single_Chat.fibonacciLoop(randomNumber);
		
	}
	
}

