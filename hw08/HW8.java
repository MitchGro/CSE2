/*
Mitchell Grohoski
CSE2
October 28th
- this program asks the user to input various characters and checks to see if they fit the parameters of the program
by calling on three different overload versions of a single method
*/
import java.util.Scanner;   // importing scanner
public class HW8{   //class
  public static void main(String []arg){    //main method
	char input;     //inputting char
	Scanner scan=new Scanner(System.in);    //initializing scanner
	
	//prompt
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan, "Cc");
	System.out.println("You entered '"+input+"'");
	
	//prompt
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	//start of next method input
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }
  
  
  
  //method 1
  public static char getInput(Scanner myScan, String value){
      
     //assigning value for user input
     String value1 = myScan.next();
      
      //check if user inputs correctly at first try
      if(value.charAt(0) == value1.charAt(0)||value.charAt(1) == value1.charAt(0)){
                      return value.charAt(0);
                  }
          
          //runs loop while the user inputs errors until theyre correct
          while(value.charAt(0) != value1.charAt(0)||value.charAt(1) != value1.charAt(0)){
              //if input is too long
              if(value1.length()>1){
                  System.out.print("Only enter one character!: ");
                  value1 = myScan.next();
                  
                  if(value.charAt(0) == value1.charAt(0)||value.charAt(1) == value1.charAt(0)){
                      return value.charAt(0);
                  }
                    }else{
                        //if input is not from specified list
                        System.out.print("You did not answer a char from the list " +value+ " try again: ");
                        value1 = myScan.next();
                        
                        if(value.charAt(0) == value1.charAt(0)||value.charAt(1) == value1.charAt(0)){
                        return value.charAt(0);
                        }
                    }
                }
             //error return statement
            char error = value.charAt(0);
            return error;
    }
        ////start of second method
        public static char getInput(Scanner myScan, String response, int attempts){
            
            //counter for number of tries specified in main method
            for(int c = 0; c< attempts; c++){
                //assigning input a value
                char statement = myScan.next().charAt(0);
                //checks to see if user input anything from specified list of inputs
                for(int i = 0; i<response.length(); i++){
                    if(response.charAt(i)==statement){
                        return statement;
                    }
                }
                    //error prompt
                    System.out.print("You did not enter a valid char: try again! ");
            }
                    //prints failure
                    System.out.println();
                    System.out.print("You failed after "+attempts+" tries");
                    return ' ';
        }
        
        //third method
        public static char getInput(Scanner myScan, String question, String digits){
            //needed to ensure loop ends at specific point
            boolean flag = true;
            
            //loop to check for errors
            while(flag){
                System.out.print(question);
                System.out.print(digits+ "-");
                String answer = myScan.next();
                
                //prompts user to reenter if number is longer than 1
                if(answer.length() >= 2){
                    System.out.println("Enter exactly one character: ");
                }else{
                    //checks to see if user input is equal to that of the specified string
                    for(int z = 0; z < digits.length(); z++){
                        
                        if(digits.charAt(z) == answer.charAt(0)){
                            //change boolean to end loop
                            flag = false;
                            System.out.println();
                            return answer.charAt(0);
                            }
                            
                        }
                        
                    }
                }
                return ' ';
        }
}
            
            
        
            
            
            
            
            
            
            
            
            
            
        
    
        
        
        
        
        
        
        
        
        
        

  
 
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
          
  
