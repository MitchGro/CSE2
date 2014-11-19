import java.util.Scanner;
public class Stuff2{
    public static void main(String []args){
        
        Scanner myScan = new Scanner(System.in);
        int size = 10;
        int array[]= new int[size];
        
      
        int sum = 0;
        int c =0;
        int x = 0;
        int min = array[0];
        System.out.print("Please enter 10 ints: ");
        while(myScan.hasNextInt()){
            x = myScan.nextInt();
            array[c] = x;
            sum = sum+ x;
            c++;
  
            
          if(c == 10){
              break;
          }
        }
        
        for(int l = 1; l<array.length; l++){
            if(array[l] <min){
                min = array[l];
                index = l;
            }
            }
        }
      
    
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
        System.out.print(sum);
    }
}
    
