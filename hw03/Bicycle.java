// Mitchell Grohoski
// September 15, 2014
// CSE2
//hw03
/* Purpose:
    -allows user to input the number of counts and the time it took for those 
    counts to occur for the istance traveled on a bicycle. It then outputs the total distance and time and average mph.
*/

import java.util.Scanner;   //importing the scanner
public class Bicycle {
    //main method required for every java program
    public static void main(String[] args){
        Scanner myScanner;  //instantiating the scanner
        myScanner = new Scanner(System.in);
        
        //user inputs
        System.out.print("Enter the number of seconds: ");
        int secsTrip = myScanner.nextInt();   //number of seconds for trip
        
        System.out.print("Enter the number of counts: ");
        int countsTrip=myScanner.nextInt();   //number of rotations for trip
        
        
        //intermediate variables and output data
        double wheelDiameter = 27.0;    //size of wheel
        double hours = secsTrip/3600;   //calculating seconds to hours
        double minutes = secsTrip/60;   //calculating seconds to minutes
        double distanceTrip;        //distanc eof the trip
        double  PI=3.14159; //value of pi
        double averageMPH;
        int  feetPerMile=5280;   //number of feet in a mile
        int inchesPerFoot=12;  //number of inches in a  foot
        
         // calculating the distance in inches (each rotation of the wheel is traveling the length of the diamter times PI)
        distanceTrip=countsTrip*wheelDiameter*PI;
        distanceTrip/=inchesPerFoot*feetPerMile;  //Distance in miles
        averageMPH = distanceTrip/hours;    //calculating average miles per hour
        
    
        
        //Print out the output data
        System.out.print("The distance in miles was "+distanceTrip+" and took "+minutes+" minutes");
        System.out.print("The average MPH was: "+averageMPH);
        
        
        
        
    
    }//end of main method
}//end of class