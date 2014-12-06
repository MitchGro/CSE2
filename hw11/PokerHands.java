/*Mitchell Grohoski
CSE2
December 3
- the program allows the user to input a poker hand of 5 cards (rank and suit)
and then displays what the name of that hand is.
*/
import java.util.Scanner;
public class PokerHands{ //main class
  public static void main(String [] args){  //main method
    Scanner myScanner;      //initializing scanner
    myScanner = new Scanner(System.in);
    //initializing variables
    String choice = " ";
    String choice2 = " ";
    char suit = ' ';
    int[] hand = new int[5];
    String rank = " ";
    
    //asks user to enter hand
   System.out.print("Would you like to enter another hand?: ");
   choice2 = myScanner.nextLine();
 //if they say yes 
if(choice2.equals("Y") || choice2.equals("y")){
    //only runs as log as they want
  do{
            //loop for suit
            for(int i = 0; i<5; i++){
              System.out.print("Enter the suit (c,d,h,s): ");
              suit = myScanner.nextLine().charAt(0);
              //checks if they enter proper suit
                if(suit == 'c' || suit== 'd' || suit == 'h' || suit == 's'){
                  if(suit == 'c'){
                    hand[i]+=0;
                  }else if(suit == 'd'){
                    hand[i]+=13;
                  }else if(suit =='h'){
                    hand[i]+=26;
                  }else if(suit == 's'){
                    hand[i]+=39;
                  }
                  }else{
                  //error checking
                  System.out.print("You did not enter a valid suit ");
                  if(i>0){
                  i--;
                  }
                }
                System.out.print("Enter a rank: ");
                rank = myScanner.nextLine();
            //checks if they enter proper rank
            if((rank.equals("a")|| rank.equals("k")|| rank.equals("q")|| rank.equals("j")|| rank.equals("10")|| rank.equals("9")|| rank.equals("8")|| rank.equals("7")|| rank.equals("6")|| rank.equals("5")|| rank.equals("4")|| rank.equals("3")|| rank.equals("2"))){
                      if(rank=="a"){
                          hand[i] += 0;
                      }else if(rank.equals("k")){
                        hand[i] += 1;
                      }else if(rank.equals("q")){
                          hand[i] += 2;
                      }else if(rank.equals("j")){
                          hand[i] += 3;
                      }else if(rank.equals("10")){
                          hand[i] += 4;
                      }else if(rank.equals("9")){
                          hand[i] += 5;
                      }else if(rank.equals("8")){
                          hand[i] += 6;
                      }else if(rank.equals("7")){
                          hand[i] += 7;
                      }else if(rank.equals("6")){
                          hand[i] += 8;
                      }else if(rank.equals("5")){
                          hand[i] += 9;
                      }else if(rank.equals("4")){
                          hand[i] += 10;
                      }else if(rank.equals("3")){
                          hand[i] += 11;
                   }else if(rank.equals("2")){
                          hand[i] += 12;
                   }
                   
                   
                   
                }else{
                 //invalid output
              System.out.print("You entered an invalid rank");
              rank = myScanner.nextLine();
             if(i>0){
                  i--;
                  }
            }
            
            
            } //end of for
       
    //accessing methods
    showOneHand(hand);
    show(hand);
    //asks user if they want to run again
    System.out.print("Would you like to enter another hand (y or Y)? : ");
    choice = myScanner.nextLine();
    for(int d = 0; d<5; d++){
      hand[d] = 0;
    }
    }while(choice.equals("y")||choice.equals("Y"));
  }    
  }

//provided method
public static void showOneHand(int hand[]){
	    String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	    String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	                    "4 ","3 ","2 "};
	    String out="";
	    for(int s=0;s<4;s++){
  	        out+=suit[s];
  	        for(int rank=0;rank<13;rank++){
    	        for(int card=0;card<5;card++){
     	            if(hand[card]/13==s && hand[card]%13==rank){
      	                out+=face[rank];
     	            }
	              }
	            }
  	            out+='\n';   
            }
  	     System.out.print(out);
	    }
	    //method to print the type of hand
	    public static void show(int[] x){
	      int[] rank = new int[13];
	      int[] suit = new int[5];
	      
	      int checkCount = 0;
	      int[] countDracula = new int[5]; //.....lol
	      int mainCount = 0;
	      //outermost loop
	     for(int t= 0; t<5; t++){ 
	       //assigns suits
	      for(int m= 0; m<5;m++){
	        if(x[t]/13== m){
	          suit[m]++;
	        }
	      }
	      
	      //assings rank to array
	        for(int j = 0; j<rank.length; j++){
	          if(x[t]%13 == j){
	            rank[j]++;
	          }
	        }
	      
	     }
      //assigns cards to an array of "counters"
      for(int u = 0; u<13; u++){
          for(int countMania = 0; countMania<5; countMania++){
            if(rank[u] == countMania){
              countDracula[countMania]++;
            }
          }
        }
        
        //Full House
        if(countDracula[2] == 1 && countDracula[3] ==  1){
          checkCount++;
          
        }
        
        //Four of a Kind
         int someCount =0;
         for(int e = 0; e<13; e++){
           if(rank[e] == 4){
             checkCount++;
             
           }else if(rank[e] == 2){
             someCount++;
           }
         }
         //Two pair and pair
         switch(someCount){
           case 2:
             checkCount++;
           
             break;
          case 1: 
            checkCount++;
              
              break;
         }
           
           //counter for straight or high card
           for(int snowflake = 0; snowflake<=4; snowflake++){
          if(countDracula[snowflake] == 5){
            for(int xmas = 0; xmas<=11; xmas++){
              if(rank[xmas] == 0 && rank[xmas+1] == 1){
                mainCount++;
              }
            }
          }
        }
           
          //straight and high card 
         switch(mainCount){
           case 1:
             checkCount++;
            
             break;
           default: 
            checkCount++;
             
             break;
         }
         //decides which to print
         switch(checkCount){
           case 1:
             System.out.print("Full House");
             break;
          case 2:
             System.out.print("Four of a Kind");
             break;
          case 3:
             System.out.print("Two Pair");
             break;
          case 4:
             System.out.print("Pair");
             break;
          case 5:
             System.out.print("Straight");
             break;
          case 6:
             System.out.print("High Card");;
             break;
          
         }
    }
}
	    