


import java.util.Scanner;
public class Methods{
  public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  public static int getInt(Scanner myScan){
        
            while(!myScan.hasNextInt()){
                String stuff= myScan.next();
                System.out.print("Invalid. Try again: ");
            }
        return myScan.nextInt();
    }
        public static int larger(int x, int y){
            if(x>y){
                return x;
            }else{
                return y;
                }
            }
            
            
        
        public static boolean ascending(int m, int n, int l){
            if(l>n&&l>m){
            return true;
            }else{
                return false;
            }
    }
}

  
            
            
            
  