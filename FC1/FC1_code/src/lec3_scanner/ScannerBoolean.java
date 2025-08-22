
package lec3_scanner;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("enter a boolean::");
        boolean b = keyboard.nextBoolean();
        System.out.println(b);
        
    }
}
