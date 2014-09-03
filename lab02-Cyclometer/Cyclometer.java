// Mitchell Grohoski
// September 3, 2014
// CSE2
/* Purpose:
    -print the number of minutes for each trip
    -print the number of counts for each trip
    -print the distance of each trip in miles
    -print the distance for the two trips combined
*/

public class Cyclometer {
    //main method required for every java program
    public static void main(String[] args){
        //input data
        int secsTrip1=480;   //number of seconds for first trip
        int secsTrip2=3220;   //number of seconds for second trip
        int countsTrip1=1561;   //number of rotations for first trip
        int countsTrip2=9037;   //number of rotations for second trip
        
        //intermediate variables and output data
        double wheelDiameter = 27.0,    //size of wheel
        PI=3.14159, //value of pi
        feetPerMile=5280,   //number of feet in a mile
        inchesPerFoot=12,   //number of inches in a  foot
        secondsPerMinute=60;    //the number of seconds in a minute
        double distanceTrip1,distanceTrip2, totalDistance;      //distance for trip one and two and the total distance
        
        System.out.println("Trip one took " +(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip two took " +(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        // calculating the distance in inches (each rotation of the wheel is traveling the length of the diamter times PI)
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile;  //Distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance = distanceTrip1+distanceTrip2; //total distance of trips
        
        //Print out the output data
        System.out.println("Trip 1 was "+ distanceTrip1 +" miles");
        System.out.println("trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
        
    
    }//end of main method
}//end of class