/*Mitchell Grohoski
CSE2
October 21st
- this program stacks nimbers from 1-9 up to the number that the user inputs. 
It does it using a for loop, a while loop, and a do while loop
*/

import java.util.Scanner;   //importing scanner
public class NumberStack{   //class 
    public static void main(String [] args) {   //main method
         Scanner myScanner;     //initializing scanner
         myScanner = new Scanner(System.in);
         
         //promtping user for input
        System.out.print("Enter a number between 1 and 9: ");
        int number = myScanner.nextInt();
        
        
        //using a for loop
        for(int n=1; n<(number+1); n++){
            //prints precise amount of rows
            for(int i=0;i<n;i++){
                //prints precise amount of certain digit
                for(int j=1; j<(2*n);j++){
                //prints value
                System.out.print(n);
                }
                System.out.println();
            }
            //prints amount of dashes
            for(int k=1; k<(2*n);k++){
                System.out.print("-");
            }
            System.out.println();
        }
        
        //spacing for next loop
        System.out.print("\n\n");
        
        //resetting variables for next loop
        int n=1;
        int i;
        int j;
        int k;
        
        //using while loop
        while(n<number+1){
            i =0;
            //amoutn of rows
            while(i<n){
                j=1;
                //prints precise amount of certain digit
                while(j<(2*n)){
                    //prints value
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
                        }
                    k=1;
            //prints dashes
            while(k<(2*n)){
                System.out.print("-");
                k++;
            }
            n++;
            System.out.println();
        }
        
        //spacing for next loop
        System.out.print("\n\n");
        
        //resetting n
        n=1;
        
        //do while loop
        //runs one time through for each component of loop before checking the argument
        do {
            i =0;
            do{
                j=1;
                do{
                    //printing value of n
                    System.out.print(n);
                    j++;
                }while(j<(2*n));    //checking if true
                    System.out.println();
                    i++;
            }while(i<n);    //checking if true
                k=1;
            do{
                System.out.print("-");
                k++;
            }while(k<(2*n));    //checking if true
                n++;
                System.out.println();
        }while(n<number+1); //checking if true
        
    }
}
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    