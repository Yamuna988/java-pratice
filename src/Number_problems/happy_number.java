package Number_problems;

import java.util.Scanner;

public class happy_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num != 1 && num != 7) {

            int sum = 0;

            while (num > 0) {
                int r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }

            num = sum;
        }

        if (num == 1 || num == 7) {
            System.out.println("Happy number");
        }
        else {
            System.out.println("Not happy number");
        }

        sc.close();
    }
}