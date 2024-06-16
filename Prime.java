import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check prime");
        int no = sc.nextInt();
        for(int i=2;i<no/2;i++)
        {
            if(no%i==0)
            {
                System.out.println(no+ " no is not a prime number");
                count =1;
                break;
            }
        }
        if(count ==0)
        {
            System.out.println(no +" is a prime number");
        }
        sc.close();

    }
    
}
