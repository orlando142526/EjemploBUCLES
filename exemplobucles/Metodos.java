
package exemplobucles;
import java.util.Scanner;

public class Metodos {
   
    private int num;
    Scanner sc=new Scanner (System.in);
   public void verDatos(){
       System.out.println("teclea numero:");
       num = sc.nextInt();
       while(num !=0){
           System.out.println(num);
           System.out.println("teclea numero:");
       num = sc.nextInt();
       
           
           
       }
       System.out.println("rematamos");
       
       
       
       
   }
   
    
}
