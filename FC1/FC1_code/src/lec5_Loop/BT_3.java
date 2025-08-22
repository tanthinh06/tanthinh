package lec5_Loop;

import java.util.Scanner;
public class BT_3 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter height: ");
        int h = scanner.nextInt();
        
        System.out.print("enter width: ");
        int a = scanner.nextInt();
        
        
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
