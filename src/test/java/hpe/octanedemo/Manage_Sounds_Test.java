package hpe.octanedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import hpe.octanedemo.Manage_Sounds;




public class Manage_Sounds_Test   {
	
		
	Random ran = new Random();
	int range = 11;
	int randomNumber = ran.nextInt(range) + 11;
		
	//int totalNumber = 20;
	 
	@Test
	public void Manage_Sounds_Positive_Test() {
		System.out.println("The Number is " + randomNumber);
		Manage_Sounds.dummycode(randomNumber);
		Manage_Sounds.fibonacciRecusion(randomNumber);
		}
 
	@Test
	public void Manage_Sounds_Negative_Test() {
		Manage_Sounds.fibonacciLoop(randomNumber);
	}
 	
}

