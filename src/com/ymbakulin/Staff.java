package com.ymbakulin;

public class Staff {
    private String nameOfStaff;
    private int hourlyRate;
    private int hoursWorked;

    private String workerName;

    private String workerFamilyName;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerFamilyName() {
        return workerFamilyName;
    }

    public void setWorkerFamilyName(String workerFamilyName) {
        this.workerFamilyName = workerFamilyName;
    }

    public Staff(String name, int hRate)
    {
        nameOfStaff = name;
        hourlyRate = hRate;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------------");
    }

    public Staff(String firstName, String lastName, int hRate)
    {
        nameOfStaff = firstName + " " + lastName;
        hourlyRate = hRate;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------------");
    }


    public void printMessage()
    {
        System.out.println("Calculating Pay...");
    }

    public int calculatePay()
    {
        printMessage();

        int staffPay;
//        here will be the new message
        staffPay = hoursWorked * hourlyRate;
        if (hoursWorked>0) return staffPay;
        else return -1;
    }

    public int calculatePay(int bonus, int allowance)
    {
        printMessage();
        System.out.println("the new message");
        if (hoursWorked>0) return hoursWorked*hourlyRate + bonus + allowance;
        else return 0;
    }

    public void setHoursWorked(int hours)
    {
//        new message
        if (hours>0) hoursWorked = hours;
        else {
            System.out.println("Error: HoursWorked cannot be smaller then zero");
            System.out.println("Error: HoursWorked not updated");
        }
    }

    public int getHoursWorked()
    {
        hoursWorked +=1;
        return hoursWorked;
    }
}
