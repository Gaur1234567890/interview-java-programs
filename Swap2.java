import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the number");
        int b = sc.nextInt();
        a = a+b; 
        b=a-b; 
        a=a-b;
        System.out.println("after swapping "+a);
        System.out.println("after swapping "+b);
        sc.close();
    }
}
