/*
 Mitchell Grohoski
 Cse2
 december 5
 -program randomly generates a 3d matrix and displays it and then orders it in ascending fashion
 */




public class MatrixSorter{
  public static void main(String arg[]){
    int temp = 0;
    
    int[][][]numbers = new int[7][17][3];
    System.out.println("The array before sorting");
    
    for(int h = 0; h<3; h++){
      System.out.print("----------------------Slab " + (h+1)+ "\n");
       for (int row=0; row < 3+2*h; row++) {
         for (int col=0; col < row+h+1; col++){
            numbers[row][col][h] = (int)(Math.random()*99);
            System.out.print(numbers[row][col][h] + " ");
           }
      
        System.out.println();
       }
      System.out.println();
    }
   System.out.println();
   
   
   
   
    
   System.out.println("The array after sorting");
  for(int s= 0; s<3; s++){
   System.out.print("----------------------Slab " + (s+1)+ "\n");
  for(int i = 0; i< 3+2*s; i++){
    for(int j = 0; j<i+s+1; j++){
      for(int k = j; k<i+s+1; k++){
       while(numbers[i][j][s] > numbers[i][k][s]){
        temp = numbers[i][j][s];
        numbers[i][j][s] = numbers[i][k][s];
        numbers[i][k][s]= temp;
       }
      }
      System.out.print(numbers[i][j][s] + " ");
    }
    
    System.out.println();
       }
       
       System.out.println();
       
      }
    }
}