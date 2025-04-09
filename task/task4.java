import java.util.Scanner;

class task4{
    public static void main(String args[]){
        Scanner mark = new Scanner(System.in);
        int a = mark.nextInt();
        int b = mark.nextInt();
        int c = mark.nextInt();
        int d = mark.nextInt();
        int e = mark.nextInt();
        int average = a+b+c+d+e;
        int marks = average/5;
        if(marks<35){
            System.out.println("Additional Class is required");
        }else{
            System.out.println("You are good to go");
        }

    }
}