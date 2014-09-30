/*Mitchell Grohoski
CSE2
lab04
september 24th
- This program allows the user to choose whether they want to play roulette, craps, or pick a card. 
It then dispays the corresponding values to the respective game
*/

import java.util.Scanner;

public class RandomGames{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter R or r for roulette, C or c for craps or P or p for pick a card: ");
        String choice = myScanner.nextString();
        
        switch (choice){
            case "R": double randomOne= (int)((Math.random()*38)+1);
                        if(randomOne==38){
                            System.out.print("Roulette: 00\n");
                        }else{
                            System.out.print("Roulette: "+randomOne+"\n");
                        }
                break;
            case "r":double randomOne= (int)((Math.random()*38)+1);
                        if(randomOne==38){
                            System.out.print("Roulette: 00");
                        }else{
                            System.out.print("Roulette: "+randomOne+"\n");
                        }
                break;
                
            case "C": double randomTwo = (int)((Math.random()*6)+1);
                      double randomThree = (int)((Math.random()*6)+1);
                      double sum = randomTwo+randomThree;
                      System.out.print("Craps: "+randomTwo+"+"+randomThree+"="+sum+"\n");
                      break;
                      
            case "c": double randomTwo = (int)((Math.random()*6)+1);
                      double randomThree = (int)((Math.random()*6)+1);
                      int sum = randomTwo+randomThree;
                      System.out.print("Craps: "+randomTwo+"+"+randomThree+"="+sum+"\n");
                      break;
                      
            case "P": double number = (int)((Math.random()*12)+1);
                      int suit = (int)((Math.random()*4)+1);
                                    switch(suit){
                                        case 1: System.out.print(number+" of hearts");
                                        break;
                                        case 2: System.out.print(number+" of spades");
                                        break;
                                        case 3: System.out.print(number+" of diamonds");
                                        break;
                                        case 4: System.out.print(number+" of clubs");
                                        break;
                                    }
            case "p": double number = (int)((Math.random()*12)+1);
                      int suit = (int)((Math.random()*4)+1);
                                    switch(suit){
                                        case 1: System.out.print(number+" of hearts");
                                        break;
                                        case 2: System.out.print(number+" of spades");
                                        break;
                                        case 3: System.out.print(number+" of diamonds");
                                        break;
                                        case 4: System.out.print(number+" of clubs");
                                        break;
                                    }
            default: System.out.print("this s not a proper input!");
            break;
        }
                                        
                                        
                                    }
        }
    

