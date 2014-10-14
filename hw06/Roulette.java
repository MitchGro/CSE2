/*Mitchell Grohoski
hw06
CSE2
October 14th 
- this program generates a random number between 1 and 38 that acts as a bet
for a game of roulette. It then runs a simulation to see how many times the number comes up out of 
a 100 spins. The simulation is then run 1000 times to see how many times everything is lost and how many
times a profit is made.It then prints the number of times when everything is lost, the total earnings
and the number of times a profit was made
*/


import java.util.Random;    //importing random generator
public class Roulette{  //class
    public static void main (String [] args){   //main method
        Random rand = new Random(); //initializing random generator
        
        // initializing counters and variables
        int choice = rand.nextInt(39);
        int answer = 0;
        int counterHundred = 0;
        int counterYes = 0; //if answer equals choice
        int counterThousand =0;
        int counterProfit = 0;
        int moneyWon = 0;
        int counterLoss = 0;
        
        while(counterThousand<1001){    //runs 100 spin-set 1000 times
            while( counterHundred < 101){   //spins 100 times
                answer = rand.nextInt(39);  //generates random number every iteration
                
                    if(choice == answer){
                        counterYes +=1; //adds one if answer and choice are equal
                    }
                    counterHundred+=1;  //increments
                }
                 
            if(counterYes>=3){
                counterProfit+=1;   //counts how many times out of 1000 plays player was profitable
                moneyWon = ((counterYes*36)-100)+moneyWon;
            }
            if(counterYes == 0){    //increments number of full losses
                counterLoss +=1;
            }
            counterHundred=0;   //reset counter so 100 spins and run again
            counterYes=0;   //makes fresh counter for the next 100-spin set
            counterThousand+=1; //increments 1000-time counter
        }
        //outputs
        System.out.print("The number of times you lost everything is: "+counterLoss+ "\n");
        System.out.print("The total winnings were: $"+moneyWon+"\n");
        System.out.print("THe number of times you made a profit was: "+counterProfit+"\n");
    }
}