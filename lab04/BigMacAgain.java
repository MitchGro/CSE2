/*Mitchell Grohoski
September 17th 2014
CSE2
lab04
- the pprogram allows a user to input how many big macs they want and whether 
they want an order of fries. It then prints out the total cost of the meal. 
big Macs cost $2.22 and fries cost $2.15
*/

import java.util.Scanner;   //import scanner

public class BigMacAgain{   //class
    public static void main(String []args){ //main method
        Scanner myScanner;  //initializing scanner
        myScanner= new Scanner(System.in);
        //initializing choice for fries variable
        char choice;
        
        //promps user for number of big macs
        System.out.print("Enter the number of Big macs you'd like: ");
        
        //checking if input is integer
        if(myScanner.hasNextInt())
            {
            //reads in number of big macs and calculates total price of them
            int nBigMacs = myScanner.nextInt();
            final double BigMac$ = 2.22;
            double totalBigMac$ = BigMac$*nBigMacs;
            
            //checks if input is a valid number of big macs
            if(nBigMacs>-1){
                System.out.print("You ordered "+nBigMacs+" at a price of $"+totalBigMac$+"\n");
                System.out.print("Would you like fries with that? (Y/y/N/n): ");
                choice = myScanner.next().charAt(0);
                    
                    //checks for input of choice of fries
                    switch(choice){
                        case 'Y': case 'y':
                            System.out.print("You ordered fries at a price of $2.15\n");
                            System.out.print("Your total order is $"+ (totalBigMac$+2.15)+"\n");
                            break;
                        case 'N': case 'n':
                            System.out.print("The otal cost of your order is $"+totalBigMac$+"\n");
                            break;
                        default:
                            System.out.print("This is not a valid choice!\n" );
                            break;
                            }
                            //default statement if input is less than 0
                            }else{
                                System.out.print("this is now a valid option!\n");
                                }
             //default statement if input is not a valid integer   
            }else{
                System.out.print("This is not a valid option!\n");
        }
    }
                
}
            


            
        
            
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
