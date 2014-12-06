import java.util.Scanner;
public class Stuff2{
    public static void main(String []args){
        
        Scanner myScan = new Scanner(System.in);
        int size = 10;
        int sum = 0;
        int array[]= new int[size];
        
      System.out.println("Enter the first digit of the array: ");
      array[0] = myScan.nextInt();
      
      for(int j = 1; j<10; j++){
          System.out.print("Enter the next digit: ");
          array[j] = myScan.nextInt();
      }
      
      int max = array[0];
      for(int i  = 0; i < array.length; i++){
          if(array[i] >max){
              max  = array[i];
          }
      }
      
      System.out.print("THe largest value is: " + max);
      System.out.println();
      int min  = array[0];
      for(int k = 0; k < array.length; k++){
          if(array[k] < min){
              min = array[k];
          }
      }
      System.out.print("The smallest value is: " + min);
      System.out.println();
      
      for(int a = 0; a < array.length; a++){
          sum+= array[a];
      }
      System.out.print("Sum: "+ sum);
      System.out.println();
      
      int[] flipme = new int[10];
      for(int b = 0; b < array.length; b++){
          flipme[b] = array[(array.length - 1) - b];
      }
      
      for(int c = 0; c <array.length; c++){
          System.out.println(array[c] + "    "+ flipme[c]);
      }
      }
    }
