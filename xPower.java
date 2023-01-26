package JavaRecursionPrograms;

public class xPower {
    public static void power(int x, int n, int pro) {
        if (x == 0) {
            System.out.println(0);
            return;
        }
        else if(n==0)
        {
            System.out.println(pro);
            return;
        }
        power(x, n - 1, pro * x);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        int x = 2, n = 5;
        power(x, n, 1);

    }
}
