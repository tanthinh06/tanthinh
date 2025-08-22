package lec5_Loop;

import java.util.Scanner;
public class BT_4 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter height: ");
        int h = scanner.nextInt();
        
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
