package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import hpe.octanedemo.Send_Message;

public class Send_Message_Test   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;
	 
	@Test
	public void Send_Message_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Send_Message.dummycode(randomNumber);
		Send_Message.fibonacciRecusion(randomNumber);
	}
 
	@Test
	public void Send_Message_Negative_Test() {
		Send_Message.fibonacciLoop(randomNumber);
	}
 
}

