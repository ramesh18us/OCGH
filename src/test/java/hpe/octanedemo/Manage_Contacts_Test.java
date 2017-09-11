package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import hpe.octanedemo.Manage_Contacts;

public class Manage_Contacts_Test   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	
	
	//int totalNumber = 20;
	 
	@Test
	public void Laptops_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Manage_Contacts.dummycode(randomNumber);
		Manage_Contacts.fibonacciRecusion(randomNumber);
		Assert.fail();
	}
 
	@Test
	public void Laptops_Contacts_Negative_Test() {
		
		Manage_Contacts.fibonacciLoop(randomNumber);	
		
	}
	
}

