import java.util.Scanner;

public class task5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();
        if(salary>=20000 || age<=25){
            System.out.println("Eligible");
            int loan = scan.nextInt();
        if(loan<=50000){
            System.out.println("Loan is available");
        }else{
            System.out.println("Loan is not available");
        }
        }else{
            System.out.println("You are not eligible for loan");
        }
    }
}
