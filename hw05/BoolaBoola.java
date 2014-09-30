/*Mitchell Grohoski
CSE2
hw05
September 28th
- program randomly assigns 3 booleans to true or false in a series of "or" and "and" statements
and then allows the user to enter if the given expression is true or false. It then tells the user 
if he or she is correct or not.
*/
import java.util.Random;
import java.util.Scanner;

public class BoolaBoola{
    public static void main(String [] args){
        Random rand = new Random();;
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //boolean values checking if the users answer is right
        boolean flag1 =true, flag2=true, flag3=true,
                flag4 = true, flag5 = true, flag6 = true, x=true,
                yesNo = true;
        //generating random variables for true or false and "&&" or "||"
        int one = rand.nextInt(2),
            two = rand.nextInt(2),
            three = rand.nextInt(2),
            v1 = rand.nextInt(2),
            v2 = rand.nextInt(2);
        
        //whether the user chooses true or false
        char choice;
        
        //prints the "&&" or "||"
        String place1 = " ";
        String place2 = " ";
         
        
        //assigning first variable
        switch(one){
            case 0:
                 flag1 = false;
                break;
            case 1: 
                flag1 = true;
                break;
                    }
                    
        //assigning second variable
        switch(two){
            case 0:
                flag2 = false;
                break;
            case 1: 
              flag2 = true;
                break;
                    }
                    
        //assigning third variable
        switch(three){
            case 0:
                 flag3 = false;
                break;
            case 1: 
                 flag3 = true;
                break;
                    }
                    
        //place 1
        switch(v1){
            case 0:
                 flag4 = false;
                 place1 = "&&";
                break;
            case 1: 
                flag4 = true;
                place1 = "||";
                break;
                    }
                    
        // place 2
        switch(v2){
            case 0:
                 flag4 = false;
                 place2 = "&&";
                break;
            case 1: 
                flag4 = true;
                place2 = "||";
                break;
                    }
          
        //assings x a true or false value based on the previous random assingment           
        if(place1.equals("&&")&&place2.equals("&&")){
            x= flag1&&flag2&&flag3;
        }else if(place1.equals("&&")&&place2.equals("||")){
            x = flag1&&flag2||flag3;
        }else if(place1.equals("||")&&place2.equals("||")){
            x= flag1||flag2||flag3;
        }else if(place1.equals("||")&&place2.equals("&&")){
            x = flag1||flag2&&flag3;
        }
        
        //asks user what they believe the value of the expression is 
        System.out.print("What is the value of this expression?"+flag1+place1+flag2+place2+flag3+ " (T/t) for true and (F/f) for false ");
        choice = myScanner.next().charAt(0);
        
        //checks user input and assings true or false value, it then prints if they were correct
        //or incorrect based on the the argument within the if-statement
        switch(choice){
            case 'T': case 't':
                yesNo = true;
                    if(x==yesNo){
                        System.out.print(" Correct!");
                    }else{
                        System.out.print(" Wrong!");
                    }
            break;
            
            case 'F': case'f':
                yesNo = false;
                    if(x==yesNo){
                        System.out.print(" Correct!");
                    }else{
                        System.out.print(" Wrong!");
                    }
            break;
                
            //error output
            default:
                System.out.print("incorrect input");
                break;
                
        }
       
    }
}
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

