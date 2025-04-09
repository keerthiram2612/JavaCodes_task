import java.util.Scanner;

class task1{
    public static void main(String args[]){
      Scanner answer = new Scanner(System.in);
      String answers = answer.nextLine();
      String a = "red";
      String b = "yellow";
      String c = "Green";
      if(answers.equals(a)){
        System.out.println("Stop");
      }else if(answers.equals(b)){
        System.out.println("Get Ready");
      }else if(answers.equals(c)){
        System.out.println("Go");
      }
    }
}