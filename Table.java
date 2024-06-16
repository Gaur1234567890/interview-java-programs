import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int table = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int data = table*i;
            System.out.println(data);
        }
        sc.close();
       
    }
    
}
