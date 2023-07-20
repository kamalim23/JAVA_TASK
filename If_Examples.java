import java.util.Scanner;

class If_Examples{
        public static void main(String  args[]){
         
        Scanner age = new Scanner(System.in);
        System.out.println("enter your age");
        int a = age.nextInt();
           if(a>18){
                System.out.println("eligible for voting");
          
    
            }
             else{
                 System.out.println("not eligible for voting");
               }


          
          {
           Scanner marks = new Scanner(System.in);
           System.out.println("enter your marks");
           int m = marks.nextInt();
           if(m<=39){
             System.out.println("your grade in D");

            }
            else if(m>=49){
               System.out.println("your grade in c");
            
           }
            else if(m>=60){
                   System.out.println("your grade in b");

                  }
            else if(m>=80){
                       System.out.println("your grade in a");
                        }
          else if(m>=90){
                     System.out.println("your grade in 0");}
}
}    
       
} 
        
        
       