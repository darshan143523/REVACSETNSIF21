package com.tnsif.assignment;
import java.util.Scanner;

class Airlines {
	 public static void main(String[] args) {
		 String name;
		 String source;
         String destination;
	 
   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter source");
        source = sc.nextLine();

        System.out.println("Enter destination");
        destination = sc.nextLine();
        System.out.println("Dear " + name + ", welcome onboard with service from " +
                source + " to " + destination + ". Thank you for choosing Sky Airlines. Enjoy your flight.");
    }
}
