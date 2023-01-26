package JavaRecursionPrograms;

import java.util.Scanner;

public class fibonacci {
    public static void fibonai(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int sum = a + b;
        System.out.println(sum);
        fibonai(b, sum, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(0);
        System.out.println(1);
        fibonai(0, 1, n - 2);
    }
}
