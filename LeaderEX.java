
import java.util.Scanner;

class LeaderEX{ 
     public static void main(String agrs[]){


{
           Scanner marks = new Scanner(System.in);
           System.out.println("enter your marks");
           int m = marks.nextInt();
           if(m<=39){
             System.out.println("your grade in D");

            }
            else if((m>=40) && (m<=59)){
               System.out.println("your grade in c");
            
           }
            else if((m>=60) && (m<=79)){
                   System.out.println("your grade in b");

                  }
            else if((m>=80) && (m<=89)){
                       System.out.println("your grade in a");
                        }
          else if(m>=90) && (m<100)){
                     System.out.println("your grade in 0");}
}
}
}