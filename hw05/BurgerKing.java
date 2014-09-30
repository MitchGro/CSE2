/*Mitchell Grohoski
CSE2 
September 28th 
hw05
-program allows a user to input whether they would like a burger fires or soda and then allows
them to choose specific details about their choice
*/
import java.util.Scanner;   //import scanner

public class BurgerKing{    //class
    public static void main(String [] args){    //main method
    
        Scanner myScanner;  //initializing scanner
        myScanner= new Scanner(System.in);
        
        //initializizing variables
        char choice;
        char choiceB;
        char choiceS;
        char choiceF;
    
        //prompting user for input
        System.out.print("Enter a letter to indicate the choice of: \nBurger (B or b)\nSoda(S or s)\nFries(F or f)");
         choice = myScanner.next().charAt(0);
        
        //process of narrowing down the details of the users order
        switch(choice)
        {
            case 'B': case 'b':
                //prompts user for toppings on burger
                System.out.print("Choose A or a for all the fixins'\nC or c for cheese\nN or n for none of the above");
                 choiceB = myScanner.next().charAt(0);
                    switch(choiceB)
                    {
                        case 'A': case 'a':
                            System.out.print("You ordered a burger with all the fixins'\n");
                            break;
                        case 'C': case'c':
                            System.out.print("You ordered a burger with cheese\n");
                            break;
                        case 'N': case'n':
                            System.out.print("You ordered a plain burger\n");
                            break;
                         default: 
                         //error statement
                            System.out.print("Not an option\n");
                            break;
                    }break;
                    
            case 'S': case 's': 
                //prompt user for type of soda
                System.out.print("Would you like Coke(C or c)\nPepsi(P or p)\nSprite(S or s)\nMountain Dew(M or m) ");
                 choiceS = myScanner.next().charAt(0);
                    switch(choiceS)
                    {
                        case 'C': case 'c':
                            System.out.print("You ordered a Coke\n");
                            break;
                        case 'P': case 'p':
                            System.out.print("You ordered a Pepsi\n");
                            break;
                        case 'S': case 's':
                            System.out.print("You ordered a Sprite\n");
                            break;
                        case 'M': case 'm':
                            System.out.print("You ordered a Mountain Dew\n");
                            break;
                         default: 
                         //error statement
                            System.out.print("Not an option\n");
                            break;
                    }break;
                    
            case 'F': case 'f':
                //prompts user for size of order
                System.out.print("Would you like a large or small order of fries(L, l, S, s)? ");
                choiceF = myScanner.next().charAt(0);
                    switch(choiceF)
                    {
                        case 'L': case 'l':
                            System.out.print("You ordered a large fry\n");
                            break;
                        case 'S': case 's':
                            System.out.print("You ordered a small fry\n");
                            break;
                    }break;
        default:
        //error statement
        System.out.print("This is not a valid option\n");
        break;
        }
                    
    }
                
}
                
                    
                    
                    
                    
                    
                    
                    
                