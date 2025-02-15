import java.util.Scanner;

class day3{
    public static void main(String args[]){
        Scanner keer = new Scanner(System.in);
        int a = keer.nextInt();
        int b = keer.nextInt();
        int c = keer.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d/e);
    }
}