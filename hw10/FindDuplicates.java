/*
Mitchell Grohoski
CSE2
november 18th 2014
- this program prompts the user to enter an array of 10 ints and then displays if there are 
duplicates and whther or not there is exactly one or not
*/


import java.util.Scanner;       //importing scanner
public class FindDuplicates{    //class
  public static void main(String [] arg){   //main method
    Scanner scan=new Scanner(System.in);    //initializing scanner
    
    //initializing array and String
    int num[]=new int[10];
    String answer="";
    
    //loop to prompt user
    do{
      System.out.print("Enter 10 ints- ");
      
      //loop to get ints 
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      //assigning out
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"  
      
      //calling hasDups method
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      
      //assigning out again
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);   
      
      //calling exactlyOneDup method
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      
      //assigning out again
      out+="exactly one duplicate.";
      System.out.println(out);
      
      //prompting user to run again
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

    //formatting the array
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  //check to see if array has any duplicates
  public static boolean hasDups(int [] myList) 
    {
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList.length; j++){
                if (i != j) {
                    if (myList[i] == myList[j]) {//check if ints equal
                        return true; // there are duplicates
                    }
                }
            }
        }
        return false; // no duplicates
    }
    
    //checks to see if array has multiple duplicates
     public static boolean exactlyOneDup(int [] myList) {
         //counter for multiples dups
         int c = 0;
        for (int i = 0; i < myList.length; i++) {
            for (int j = (i+1); j < myList.length; j++){
                if (i != j) {
                    if (myList[i] == myList[j]) {   //check if ints equal
                    c++;    //increment
                    
                    }
                }
            }
        }
            //return statements for multiple dups
            if(c!=1){
                return false;
            }else{
                return true ; // no duplicates
        }
    }
}
