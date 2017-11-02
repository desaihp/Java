
package com.sumofdigits.task;

import java.util.Scanner;

public class ComSumofdigitsTask {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int m, n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = input.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
        }
    
}
