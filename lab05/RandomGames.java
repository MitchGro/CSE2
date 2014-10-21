/*Mitchell Grohoski
CSE2
lab04
september 24th
- This program allows the user to choose whether they want to play roulette, craps, or pick a card. 
It then dispays the corresponding values to the respective game
*/

import java.util.Scanner;   //importing scanner

public class RandomGames{   //class
    public static void main(String[] args){ //main method
        Scanner myScanner;  //initializing scanner
        myScanner = new Scanner(System.in);
        
        //prompting user for the game theyd like to play
        System.out.print("Enter R or r for roulette, C or c for craps or P or p for pick a card: ");
        char choice = myScanner.next().charAt(0);
        
        //testing which game the user chose
        switch (choice){
            case 'R': case 'r': double randomOne= (int)((Math.random()*38)+1);
                                if(randomOne==38){
                                    System.out.print("Roulette: 00\n");
                                }else{
                                    System.out.print("Roulette: "+(int)randomOne+"\n");
                                }
                                break;
            //output if game type wasnt implemented
            default:
                System.out.print("This has not been implemented yet!\n");
                break;
        }
    }
}
                
            
    

