import java.util.*;
class Test
{
    
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("factorial of the number is "+fact);
        sc.close();
    }
}