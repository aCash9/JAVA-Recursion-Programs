package JavaRecursionPrograms;

import java.time.chrono.MinguoChronology;

public class counPaths {
    public static int paths(int i, int j, int m, int n) {
        if (i == m || j == n)
            return 0;
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        int verticalPaths = paths(i + 1, j, m, n);
        int horizontalPaths = paths(i, j + 1, m, n);
        return verticalPaths + horizontalPaths;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(paths(0, 0, m, n));
    }
}
