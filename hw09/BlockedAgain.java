/*Mitchell Grohoski
CSE02
November 4th
- this program allows the user to input an integer from 1-9 and it outputs that many stacks of numbers on top of
one another.
*/


import java.util.Scanner;   //importing scanner
public class BlockedAgain{  //class
    public static void main(String [] args){    //main method
    //initializing m
    int m;

    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
   //calling allBlocks() method
    allBlocks(m);
    }
    //getInt() method
  public static int getInt(){
      //prompts user for input
      Scanner myScan =new Scanner(System.in);
      System.out.print("Enter an integer between 1-9 inclusive: ");
      int x = checkRange(myScan);
      return x;
  }
  
//checks to make sure it is in correct range
public static int checkRange(Scanner myScan){
    //before checking range checks to see if input is int
    int i = checkInt(myScan);
    //range for input
    while(i<1||i>9){
        System.out.print("Not in the correct range: ");
       i = myScan.nextInt();
    }
    //i is now m
    return i;
}

//checking if integer value 
  public static int checkInt(Scanner myScan){
      //repeats until int is found
      while(!myScan.hasNextInt()){
                String stuff= myScan.next();
                System.out.print("Invalid int. Try again: ");
      }
      //goes to checkRange() method as i
      return myScan.nextInt();
}

public static void allBlocks(int p){
    //prints certain number of lines
    for( int c = 1; c<p+1; c++){
        
            //prints the same number on new line that number of times
            for(int t= 0; t<c; t++){
            //number of numbers per line
            block(c);
            System.out.println(c);
            }
            
        //calling line for spacing
       line(c);
    }
    
    System.out.println();

}

//block method
public static void block(int g){
    //number of numbers per line
    for(int h= 1; h<((2*g)-1); h++){
        //prints value
        System.out.print(g);
    }
}
//line method
public static void line(int m){
    //prints specific number of hyphens
     for(int k=1; k<(2*m);k++){
                System.out.print("-");
            }
            System.out.println();
        }
}

