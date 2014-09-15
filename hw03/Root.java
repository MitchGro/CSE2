/*Mitchell Grohoski
CSE2
September 15th 2014
hw03
-program takes a user input and through a series of guesses calculates the cube root of the inputted number
and then that crude cube root cubed.
*/

import java.util.Scanner;   //importing Scanner
public class Root{  //defining class
    public static void main(String[] args){ //main method
        Scanner myScanner;  //instantiating scanner
        myScanner = new Scanner(System.in);
        
        //user input
        System.out.print("Please enter a double and I will provide the cube root: " );
        double number = myScanner.nextDouble();
        
        //calculations for guessing cube root of input
        double guessOne=number/3;
        double guessTwo=(2*guessOne*guessOne*guessOne+number)/(3*guessOne*guessOne);
        double guessThree=(2*guessTwo*guessTwo*guessTwo+number)/(3*guessTwo*guessTwo);
        double guessFour=(2*guessThree*guessThree*guessThree+number)/(3*guessThree*guessThree);
        double guessFive=(2*guessFour*guessFour*guessFour+number)/(3*guessFour*guessFour);
        double guessSix=(2*guessFive*guessFive*guessFive+number)/(3*guessFive*guessFive);
        double guessSeven=(2*guessSix*guessSix*guessSix+number)/(3*guessSix*guessSix);
        double guessSevenCubed=guessSeven*guessSeven*guessSeven;
        
        //output of the crude cube root and that number cubed
        System.out.println("The cube root is: "+guessSeven);
        System.out.println("The cube root cubed is: "+guessSevenCubed);
        
        
    }
}