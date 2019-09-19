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
public class RetailPriceCalculator 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a wholesale price");
        
        double wholesalePrice = keyboard.nextDouble();
        
        System.out.println("Enter a markup percentage");
        
        double markup = keyboard.nextDouble();
        
        double finalPrice = calculateRetail(wholesalePrice, markup);
        
        System.out.println("The final price is: " + finalPrice);
    }

    public static double calculateRetail(double wholesalePrice, double markup) {
        double finalPrice = wholesalePrice * (1 + markup);
        return finalPrice;
    }
}
