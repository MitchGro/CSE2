/*Mitchell Grohoski
CSE2
hw04
September 23
- this program allows the user to input a course number
and then it outputs the year that course was given and
which smemester
*/

import java.util.Scanner;   //importing scanner

public class CourseNumber{  //class
    public static void main(String[] args){ //main method
        Scanner myScanner;      //initializing scanner
        myScanner = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter a six digit number giving the course semester: ");
        int course = myScanner.nextInt();
        
        //initializing necessary variables
        int semester = course%100;
        int year = (course -semester)/100;
        
        //testing to see if input is within range
        if(course <=201440&&course>=186510){
            //checking and outputting course semester and year
            switch(semester){
                case 10: System.out.print("This course was offered in the Spring semester of "+year+"\n");
                break;
                case 20: System.out.print("This course was offered in the Summer 1 semester of "+year+"\n");
                break;
                case 30: System.out.print("This course was offered in the Summer 2 semester of "+year+"\n");
                break;
                case 40: System.out.print("This course was offered in the Fall semester of "+year+"\n");
                break;
                default: System.out.print(semester + " is not a legitimate semester\n");
                break;
            }
            }else{
                //error clause for courses entered outside of the range
                System.out.print("This number is outside of the valid range!\n");
        }
        
     }
}
