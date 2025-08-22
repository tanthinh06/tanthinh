package lec5_Loop;

import java.util.Scanner;
public class BT_2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter int number: ");
        int a = scanner.nextInt();
        for(int i=1;i<=10; i++)
        {
            int b= a*i;
            System.out.println(a+" x "+i+" = "+ b );
        }
    }
    
}
