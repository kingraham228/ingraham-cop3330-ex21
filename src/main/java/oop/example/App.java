package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kate Ingraham
 */

import java.util.Scanner;

/**Write a program that converts a number from 1 to 12 to the corresponding month.
 * Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
 * For any value outside that range, display an appropriate error message.

 Example Output
 Please enter the number of the month: 3
 The name of the month is March.

 Constraints
 Use a switch or case statement for this program.
 Use a single output statement for this program.*/

public class App 
{
    public static void main( String[] args )
    {
        App myApp = new App();
        int inputMonth = myApp.enterMonth();
        myApp.generateOutput(inputMonth);

    }

    public int enterMonth() {
        Scanner input = new Scanner(System.in);
        int month;

        do{
            System.out.println("Please enter the number of the month: ");

            while(!input.hasNextInt()){
                String testString = input.next();
                System.out.println(testString+" is not a valid month.");
                System.out.println("Please enter the number of the month: ");
            }

            month = input.nextInt();
            if (month < 1 || month > 12){
                String errorString = "Error. This number does not correspond to a month.";
                System.out.println(errorString);
                month = -1;
            }

        } while (month < 0);
        return month;
    }

    public void generateOutput(int monthNumber) {
        String monthName;

        switch (monthNumber){
            case 1:
                monthName = "January.";
                break;
            case 2:
                monthName = "February.";
                break;
            case 3:
                monthName = "March.";
                break;
            case 4:
                monthName = "April.";
                break;
            case 5:
                monthName = "May.";
                break;
            case 6:
                monthName = "June.";
                break;
            case 7:
                monthName = "July.";
                break;
            case 8:
                monthName = "August.";
                break;
            case 9:
                monthName = "September.";
                break;
            case 10:
                monthName = "October.";
                break;
            case 11:
                monthName = "November.";
                break;
            default:
                monthName = "December.";
                break;
       }

        System.out.println("The name of the month is: "+monthName);
    }
}
