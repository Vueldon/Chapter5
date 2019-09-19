/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter5;

import java.util.Scanner;

/**
 *
 * @author 0788763
 */
public class Main 
{

    public static void main(String[] args) 
    {
        System.out.println("Enter your first and last name");
        Scanner keyboard = new Scanner(System.in);
        
        String first = keyboard.nextLine();
        String last = keyboard.nextLine();
        
        System.out.println("Your full name is: " + getFullName(first, last));
    }
    
    /**
     * 
     * @param somethingToPrint
     */
    
    public static String getFullName(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }
    
    public static boolean isNegative(int number)
    {
        if(number < 0)
        {
            return true;
        } else
        {
            return false;
        }
    }
    
    public static void printText(String somethingToPrint)
    {
        System.out.println(somethingToPrint);
    }
    
    public static void addTwoNumbersAndPrint(double firstNumber, double secondNumber)
    {
        double sum = firstNumber + secondNumber;
        
        System.out.println("The sum is: " + sum);
    }
    public static double addTwoNumbers(double firstNumber, double secondNumber)
    {
        double sum = firstNumber + secondNumber;
        
        return sum;
    }
}
