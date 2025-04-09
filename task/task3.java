import java.util.Scanner;

class task3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score<50){
            System.out.println("Your need to improve");
        }else if(score>=50 && score<=70){
            System.out.println("Good job but !");
        }else{
            System.out.println("Excellent performance!");
        }
        
    }
}