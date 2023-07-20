import java.util.Scanner; 


class Nested_ex{
          public static void main(String args[]){
           Scanner nested = new Scanner(System.in);
           System.out.println("enter your age");
           int age =nested.nextInt();
        
          if( age>18){
                System.out.println("enter your 12 percentage");
             int mark =  nested.nextInt();
             
             if( mark>=60){
                     
                
                  System.out.println("your eligible");
}
               else{
                   System.out.println("not enough");
}

      
                   
          
} else {
                   System.out.println("your not eligible");

                   } 

}
}
