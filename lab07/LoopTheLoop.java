import java.util.Scanner;
public class LoopTheLoop{
    public static void main (String[] args){
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        
        
        
        System.out.print("Enter an int between 1 and 15: ");
        int nStars = myScanner.nextInt();
        while(!myScanner.hasNextInt()||nStars<0){
            String stuff = myScanner.next();
            System.out.print("This is not valid, try again: ");
        }
        
        
        for(int i = 0; i<nStars; i++){
            for(int j = 0; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
            
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}