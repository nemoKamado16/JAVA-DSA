package practice;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number?");
        String Number = sc.next();
        int num = Integer.parseInt(Number);
        do { 
            num = num/2;
            System.out.println(num);
        }
        while (num != 0);
    }
}
