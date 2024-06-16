import java.util.*;
class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the number");
        int b = sc.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("after swapping"+a);
        System.out.println("after swapping"+b);
        sc.close();
    }
}
