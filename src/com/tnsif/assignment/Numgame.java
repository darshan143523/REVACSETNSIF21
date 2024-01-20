package com.tnsif.assignment;
import java.util.Scanner;

class Numgame {
	public static void main(String[] args) {
		 int number1;
	     int number2;
	     int number3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = scanner.nextInt();

        System.out.println("Enter the second number");
        number2 = scanner.nextInt();

        System.out.println("Enter the third number");
        number3 = scanner.nextInt();
   
        int smallest = (number1 < number2) ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallest);
        }
    }
}


