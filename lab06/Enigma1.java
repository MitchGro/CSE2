/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []args){
    double percent;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    
   System.out.println("You entered "+x+"%");
   
   double proportion = (100-x)/100;
   
   //print out the proportion remaining for select percentages
   if(proportion <1&&proportion>0){  //when the user enters 7
      System.out.println("The proportion remaining is "+ proportion);
    }else{
        System.out.print("This is not a valid input");
    }
  }
  
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * - the proportion equation should be (100-x)/100
 - should print proportion and not preassigned values allowing for more than a few inputs
 * 
 * 
 * 
 */


   
   
   
   
   
   
  

