package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import hpe.octanedemo.Search_Contacts;

public class Search_Contacts_Test   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
		
	//int totalNumber = 20;
	 
	
	@Test
	public void Promotions_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Search_Contacts.dummycode(randomNumber);
		Search_Contacts.fibonacciRecusion(randomNumber);
		Assert.fail();
	}
 
	@Test
	public void Promotions_Negative_Test() {
		
		Search_Contacts.fibonacciLoop(randomNumber);
	}

	
}

