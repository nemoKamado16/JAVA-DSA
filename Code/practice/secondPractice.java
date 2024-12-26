package practice;

import java.util.Scanner;

public class secondPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //!Write a Java program to swap two numbers using a third variable.
        // int a=2;
        // int b=3;
        // int temp = a;
        // a=b;
        // b=temp;
        // System.out.println(a);
        // System.out.println(b);
        //!Write a program to find the sum and average of two numbers
        
        // String digit1 = sc.next();
        // int num1 = parseInt(digit1);

        // String digit2 = sc.next();
        // int num2 = parseInt(digit2);

        // System.out.println(num1+num2);
        // System.out.println((num1+num2)/2);

        //!Write a program to print numbers from 1 to 10 using a for loop

        // int num =10;
        // for(int i =0;i<=num;i++) {
        //     System.out.println(i);
        // }
        
        //!Write a program to print the multiplication table of a number using a while loop

        // for(int i=1; i<=10;i++) {
        //     for(int j=1;j<=5;j++) {
        //         System.out.println( i + "*" + j + "=" + i*j);
        //     }
        // }

        //!Write a program to calculate the factorial of a number using a loop

        int num = sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
