/*Mitchell Grohoski
CSE2
October 14 
hw06
- the program allows the user to input a number and then through the bisection method 
it finds the square root of the input
*/

import java.util.Scanner;   //importing scanner
public class Root{  //class
    public static void main(String[] args){ //main method
        Scanner myScanner;  //initializing scanner
        myScanner = new Scanner(System.in);
        
        //asks user for input
        System.out.print("Input a number as a double: ");
        
       //checks if input is a double 
     if(myScanner.hasNextDouble()){  
         double x = myScanner.nextDouble();
         //checks if input is greater than 0
            if(x>0){
                //initializing variables
                double high  = 1+x;
                double low = 0.0;
                double difference = high - low;
                double middle = 0;
                double middleS;
                
                    //start of loop while the difference is greter than a small factor
                    while((difference)>.0000001){
                        middle  = (high +low)/2;
                        middleS = middle*middle;
                            //assigns middle to high
                            if(middleS>x){
                                high = middle; 
                            //assigns high to middle
                            }else if(middleS<x){
                                low = middle; 
                            }
                                //calculating the difference
                                difference = high - low;
                    }
                    //output of the square root
                    System.out.print("The square root is: "+ low);
                    
            }else{ 
                //error output
                System.out.print("This is not a valid input!");
                 }
        }else{
            //error output
        System.out.print("This is not a valid input!");
     }
    }
       
}
    
    
        
    
    

            
            
            
            
            
            
            
            
            
            
        
        
          
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
