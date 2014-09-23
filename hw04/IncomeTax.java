/*Mitchell Grohoski
CSE2
hw04
September 22
-the program prompts the user to enter an int in thousands of dollars
-of income and then prints out the tax on that income 
*/

import java.util.Scanner;   //main method

public class IncomeTax{ //class IncomeTax
    public static void main(String[] args){
        Scanner myScanner;  //initializing scanner
        myScanner = new Scanner(System.in);
        
        //asks user for input
        System.out.print("Enter the amount of thousands of dollars as an int: ");
        
        if(myScanner.hasNextInt()){     //checking for integer
            
            int dollars = myScanner.nextInt();
            int dollars1= dollars*1000; //converting int to thousands
           
            if(dollars>=0){ //checks if input is greater than 0
               double taxRate;  //initialize taxRate
        
                //checking for ranges
                if(dollars>=78){
                   taxRate = .14;
                }
                if(dollars>=40&&dollars<78){
                   taxRate = .12;
                }
                if(dollars>=20&&dollars<40){
                    taxRate= .07;
                }else{
                    taxRate=.05;
                }
                double tax;    //initializing the tax value
                tax= dollars1*taxRate;
                
                //output statement
                System.out.print("The tax rate on "+dollars1+" is "+(taxRate*100)+" and the tax is %"+tax);
                
                }else{
                //error message if integer is negative
                System.out.print("This is not a positive number\n");
                }
                
                }else{
                //error message if input is anything but integer
                System.out.print("You did not enter an int!\n");
                
            }
                
        }
     }
            
        
    
    
