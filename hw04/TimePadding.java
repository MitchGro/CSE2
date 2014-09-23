/*Mitchell Grohoski
CSE2
September 23
hw04
- this program allows the user to input an amount of seconds elapsed
and then outputs that time in the form of hours:minutes:seconds.
*/
import java.util.Scanner;   //importing scanner

public class TimePadding{   //class 
    public static void main(String[] args){ //main mether
        Scanner myScanner; //initializing scanner
        myScanner = new Scanner(System.in);
        
        //prompting user for time
        System.out.print("Please enter the time the amount of time in seconds that has elapsed: ");
        int seconds = myScanner.nextInt();
        
        //initializing variables
        int leftover1 = 0;
        double hours = 0.0;
        int leftover2 = 0;
        double minutes = 0.0;
        int secondsLeft=0;
        
        //checking whether or not to calculate for hours
        if(seconds>=3600){
            
            //assigning variables to values for calculation
            leftover1 = seconds%3600;
            hours = (seconds/3600);
            int hours1 = (int)hours;    //casting to an int to get whole number values
            
            minutes = (leftover1/60);
            int minutes1 = (int)minutes;
            leftover2 = leftover1%60;
            
            //output of time
            System.out.print(hours1+" hours:"+minutes1+" minutes:"+leftover2+" seconds\n");
            
            //checking to see if program should calculate just minutes
            }else if(seconds>=60&&seconds<3600){
                
            //assigning variables values    
            leftover2=seconds%60;
            minutes = (seconds/60);
            int minutes1 = (int)minutes;
            
            //output statement of elapsed time
            System.out.print(minutes1+" minutes:"+leftover2+" seconds\n");
            
            //checking if only printing seconds is apt
            }else if (seconds>=0&&seconds<60){
                System.out.print(seconds+" seconds\n");
            }else{
                //error output
                System.out.print(" This is not a valid elapsed time!\n");
        }
    }
}
        
    
