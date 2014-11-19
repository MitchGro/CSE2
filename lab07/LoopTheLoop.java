import java.util.Scanner;
public class LoopTheLoop{
    public static void main (String[] args){
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        int m;
        m = getInt(); 
        
        for(int i = 0; i<m;i++){
            System.out.print("*");
        }
        for(int j= 0; j<m+1; j++){
            for(int k= 0; k<j;k++){
                
                    System.out.print("*");
                }
                System.out.println();
            }
        
    }

        
           
    public static int getInt(){
      //prompts user for input
      Scanner myScan =new Scanner(System.in);
      System.out.print("Enter an integer between 1-15 inclusive: ");
      int x = checkRange(myScan);
      return x;
  }     
  
  public static int checkRange(Scanner myScan){
    //before checking range checks to see if input is int
    int i = checkInt(myScan);
    //range for input
    while(i<1||i>15){
        System.out.print("Not in the correct range: ");
       i = myScan.nextInt();
    }
    //i is now m
    return i;
}
        
 public static int checkInt(Scanner myScan){
      //repeats until int is found
      while(!myScan.hasNextInt()){
                String stuff= myScan.next();
                System.out.print("Invalid int. Try again: ");
      }
      //goes to checkRange() method as i
      return myScan.nextInt();
}
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
