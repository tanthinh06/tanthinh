package lec5_Loop;

import java.util.Scanner;
public class BT_1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a one munber int: ");
        int n = scanner.nextInt();
        int sum= 0;
        for(int i=1; i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("the sum for numbers 1 to "+ n + ": "+ sum );
    }
    
}
