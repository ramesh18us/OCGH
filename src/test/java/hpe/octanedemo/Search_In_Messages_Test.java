package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import hpe.octanedemo.Search_In_Messages;

public class Search_In_Messages_Test   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;
	 
	@Test
	public void Shopping_Cart_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Search_In_Messages.dummycode(randomNumber);
		Search_In_Messages.fibonacciRecusion(randomNumber);
	}
 
	@Test
	public void Shopping_Cart_Negative_Test() {
		Search_In_Messages.fibonacciLoop(randomNumber);
		Assert.fail();
	}
 
}

