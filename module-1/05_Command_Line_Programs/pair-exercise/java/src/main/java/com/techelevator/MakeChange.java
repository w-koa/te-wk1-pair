package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter bill total: $");
		String totalStr = input.nextLine();
		double totalBill = Double.parseDouble(totalStr);
		
		System.out.print("Enter amount paid: $");
		String amountStr = input.nextLine();
		double amountTendered = Double.parseDouble(amountStr);
		
		double change = amountTendered - totalBill;
		System.out.println("Change required: $" + String.format("%.2f", change));
		

	}

}
