package com.techelevator;

import java.util.Scanner;
/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		double [] earthWeights = new double[3];
		
		System.out.print("Enter three Earth weights [separated by spaces]: ");
		for (int x=0; x < earthWeights.length; x++) {
			String weightsStr = input.next();
			String [] weightsSplit = weightsStr.split(" ");
			earthWeights[x] = Double.parseDouble(weightsStr);
		}
		for (int x=0; x < earthWeights.length; x++) {
			double marsWeights = earthWeights[x]*0.378;
			System.out.println(String.format("%8.1f",earthWeights[x])+ " lbs. on Earth is equal to "+ String.format("%8.1f",marsWeights)+ " lbs. on Mars");	
		}

	}
}