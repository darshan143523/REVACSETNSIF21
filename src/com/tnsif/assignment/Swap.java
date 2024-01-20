package com.tnsif.assignment;
import java.util.Scanner;

class Swap {
	public static void main(String[] args) {
		 int firstNumber;
	     int secondNumber;
	     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();

        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
    
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);  
}
}
