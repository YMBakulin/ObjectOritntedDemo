package com.ymbakulin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Set new status to my github project
        Scanner inputHourlyRate = new Scanner(System.in);
        System.out.print("Please enter hourly rate for Yuriy Bakulin: " );
        int myHourlyRate = 25;
       do {
           myHourlyRate = inputHourlyRate.nextInt();
           if (myHourlyRate<=0) System.out.println("Error: hourly rate cannot be smaller then zero!");
       } while (myHourlyRate <= 0);

Staff staff1 = new Staff("Peter", myHourlyRate);
staff1.setHoursWorked(160);
int pay = staff1.calculatePay(1000, 300);
System.out.println("Pay = " + pay);

Staff staff2 = new Staff("Kiwako", "Ito", 35);
staff2.setHoursWorked(160);
System.out.println("\nHours Worked = " + staff2.getHoursWorked());
pay = staff2.calculatePay();
System.out.println("Pay = " + pay);


    }
}
