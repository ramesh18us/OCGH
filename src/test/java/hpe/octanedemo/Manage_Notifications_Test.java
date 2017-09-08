package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import hpe.octanedemo.Manage_Notifications;

public class Manage_Notifications_Test   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
	


	//int totalNumber = 20;
	 
	@Test
	public void Mice_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Manage_Notifications.dummycode(randomNumber);
		Manage_Notifications.fibonacciRecusion(randomNumber);
		//Assert.fail();
	}
 
	@Test
	public void Mice_Negative_Test() {
		Manage_Notifications.fibonacciLoop(randomNumber);
	}
 
}

