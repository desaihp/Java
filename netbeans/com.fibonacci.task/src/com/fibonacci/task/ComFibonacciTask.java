
package com.fibonacci.task;

import java.util.Scanner;


public class ComFibonacciTask {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=1,b=1,c=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("error");
        
        while(c<=n)
        {
            c = a+b;
            if (c>=n)
            {
                break;
            }
            System.out.println(c+ " ");
            a=b;
            b=c;
            
        }
        
    }
    
}
