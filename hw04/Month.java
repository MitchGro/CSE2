/*Mitchell Grohoski
CSE2
September 23
hw04
-this program allows a user to input a number corresponding to a month and 
then prints the number of days in the respective month. If the month chosen happens
to be february, they are asked for a year and then prompted with the amount of days.
*/

import java.util.Scanner;   //importing scanner

public class Month{ //class 
    public static void main(String[] args){     //main method

        Scanner myScanner;  //initializing scanner
        myScanner = new Scanner(System.in);
        
        //initializing variable
        int monthDays =0;
        
        //prompting user for month
        System.out.print("Please enter the month you're requesting as a number: ");
        int month = myScanner.nextInt();
        
        //switch to check for month
        switch (month) {
            case 1: monthDays = 31;
            break;
            case 2: 
                System.out.print("Please choose a year: ");
                int year = myScanner.nextInt();
        
                if(year%4==0){
                    monthDays = 29;
                    
                    
                }else{
                    monthDays=28;
                }
            break;
            
            case 3: monthDays = 31;
            break;
            
            case 4: monthDays = 30;
            break;
            
            case 5: monthDays = 31;
            break;
            
            case 6: monthDays = 30;
            break;
            
            case 7: monthDays = 31;
            break;
            
            case 8: monthDays= 31;
            break;
            
            case 9: monthDays = 30;
            break;
            
            case 10: monthDays = 31;
            break;
            
            case 11: monthDays = 30;
            break;
            
            case 12: monthDays = 31;
            break;
            //error statement if outside range
            default: System.out.print("This is an invalid month!\n");
            break;
            }
            //only prints if within range
            if(month>=1&&month<=12){
            System.out.print("The amount of days in this month are: "+monthDays+"\n");
        }
    }
}





