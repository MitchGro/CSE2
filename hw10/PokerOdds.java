import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    //simulateOdds();
  }
  
  public static void showHands(){
     
     int myList[] = new int[51];
     int myHand[] = {-1, -1, -1, -1, -1};
   
     int index = 0;
     for(int j = 0; j<myList.length; j++){
         myList[j] = j;
     }
     
     for(int i = 0; i<myHand.length; i++){
        double randCard = Math.random()*52;
        index = (int)randCard;
        index = myHand[i];
        
        System.out.println(myHand[i]);
  }
  
  
  
  
  
  
  
  
  
  
}
}
