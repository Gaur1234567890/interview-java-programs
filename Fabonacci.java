import java.util.Scanner;

public class Fabonacci {
  public static void main(String[] args) {
    int a=0,b=1,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to print series");
    int  no = sc.nextInt();
    System.out.print(a+" "+b);
    for(int i=2;i<no;i++)
    {
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
    }
    sc.close();
}  
}
