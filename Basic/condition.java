import java.util.Scanner;

class condition{
    public static void main(String args[]){
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        int b = num1.nextInt();
        if(a==b){
            System.out.println("Both are equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}