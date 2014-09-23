/*Mitchell Grohoski
September 17th 2014
CSE2
lab04
- the pprogram allows a user to input how many big macs they want and whether 
they want an order of fries. It then prints out the total cost of the meal. 
big Macs cost $2.22 and fries cost $2.15
*/

import java.util.Scanner;

public class BigMacAgain{
 public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of big Macs: ");
        int bigMacs =myScanner.nextInt();
        
       if(myScanner.hasNextInt()){
           if(bigMacs>-1){
               final double bigMacCost$=2.22;
               double cost = bigMacCost$*bigMacs;
               System.out.print("You ordered "+bigMacs+"Big Macs for a cost of: "+cost);
           }else{
               System.out.print("Wrong! Try again.");
               return;  //leaves the program
          
            
            }else{
            System.out.print("Thats not even a number");
               return;  //leaves the program
             }
       }
                System.out.print("Do you want an order of fries (Y/y/N/n)?: ");
                char decision=myScanner.nextChar();
        
                if(myScanner.hasNextChar("Y")||myScanner.hasNextChar("y")){
            
                final double friesCost = 2.15;
                double totalCost=friesCost+cost;
            
                System.out.print("You ordered fries at $"+friesCost);
                System.out.print("The total cost of the meal is $"+totalCost);
            }else if(myScanner.hasNextChar("N")||myScanner.hasNextChar("n")){
                double totalCost=cost;
                System.out.print("The total cost of the meal is $"+totalCost);
            }else{
                System.out.print("You did not answer the question properly");
                return; //end program
        }
    }
            
}
        
        
        
        
    
    
}