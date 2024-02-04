package com.assignment2;
import java.util.Scanner;

class Customer {
    private String name;
    private int numOfAdults;
    private int numOfChildren;
    private int numOfDays;

    public Customer(String name, int numOfAdults, int numOfChildren, int numOfDays) {
        this.name = name;
        this.numOfAdults = Math.max(0, numOfAdults);
        this.numOfChildren = Math.max(0, numOfChildren);
        this.numOfDays = Math.max(1, numOfDays);
    }

    public int calculateTotalCost() {
        return 1000 * numOfAdults + 650 * numOfChildren;
    }

    public String toString() {
        return name + ", your booking is confirmed, and the total cost is " + calculateTotalCost();
    }
}

public class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details (name:numOfAdults:numOfChildren:numOfDays):");
        String[] inputArray = scanner.nextLine().split(":");

        if (inputArray.length != 4) {
            System.out.println("Invalid input format");
            return;
        }

        Customer customer = new Customer(inputArray[0], Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2]), Integer.parseInt(inputArray[3]));
        System.out.println(customer);
    }
}
