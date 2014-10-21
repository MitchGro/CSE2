/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma{
  public static void main(String[] args){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    int n = 0;
    
    if(scan.hasNextInt()){
       n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
       n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 -in the main method it should be [] args*
 - the variable n needs to be initialized first outside of if statement
- n should not be initialized again in the else part
- - n is already defined once doesnt need to be defined in line 25
 *   Explain the error(s) that occurred here, and then fix them
 */