import java.util.Scanner;

public class day4 {
   public static void main(String args[]){
    Scanner shin = new Scanner(System.in);
     String a = shin.nextLine();
     Double b = shin.nextDouble();
     shin.nextLine();
     String c = shin.nextLine();
     System.out.println("Enter your name :" +a);
     System.out.println("Enter your score :" +b/10+"/10");
     System.out.println("Enter your department :" +c);
   }
    
}