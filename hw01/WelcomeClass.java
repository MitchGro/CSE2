//  Mitchell Grohoski
// CSE2
//  Welcome Class Java Program - hw01

//  define a class 
public class WelcomeClass{

//  add main method 
public static void main(String[] args){
int i = 0, j = 20;
while (i < 30) {
    while (j > 0) {
        System.out.println(i + j);
        j -= 4;
    }
    i += 4; 
}
}
}