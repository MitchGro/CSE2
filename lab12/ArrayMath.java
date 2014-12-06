public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double[] a , double[] b){
      boolean t = true;
      boolean f  = false;
      int count  = 0;
      if( a.length == b.length){
          for(int c = 0; c<a.length; c++){
              if(a[c] == b[c]){
                  count ++;
                  if(count == 3){
                    return t;
                  }
            
              }
          }
        
      }
    return f;
  }
  
  public static double[] addArrays(double[] c, double[] d){
      double[] e = new double[c.length];
      double[] f = new double[c.length];
      
      if(c.length == d.length){
          for(int g = 0; g< c.length; g++){
              f[g] = c[g]+d[g];
            }
            return f;
        }
      
      if(c.length != d.length){
        for(int k = 0; k<d.length; k++){
              e[k] = d[k];
            }
        for(int j = 3; j<c.length; j++){
             e[j] = 0;
            }
        for(int i = 0; i<c.length; i++){
             f[i] = c[i]+e[i];
            }
            return f;
        }
    return f;
  }

}

