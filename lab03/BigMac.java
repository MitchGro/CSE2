/*
Mitchell Grohoski
CSE2
9/10/2014
lab03
- computes the cost of buying big macs
- the cost per big mac and the percentage tax cost of the big macs
*/

import java.util.Scanner;   //importing the scanner

    public class BigMac{    
    //main method
    public static void main(String] args){
        Scanner myScanner; 
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Big Macs (integer . 0): ");
        int nBigMacs = myScanner.nextInt();
        
        System.out.print("Enter the cost of a Big Mac(in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;   //user enters percent but i want proportion
        
        double cost$;
        int dollars,    //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$
        
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction 
        dollars = (int)cost4;
        //get dimes amount
        dimes = (int)(cost$*10)%10;
        pennies = (int)9cost4*100)%10;
        System.out.println("The total cost of " nBigMacs+" BigMacs, at $"+bigMac$+" per BigMac, with a sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);
        
        
    
}