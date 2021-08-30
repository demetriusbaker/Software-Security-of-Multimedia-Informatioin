package Variant7;

public class Class {
    public static void Method1(float a, float b, float c){
        if (a > b && b > c){
            a *= 2;
            b *= 2;
            c *= 2;

            System.out.println("A: " + a + ", B: " +
                    b + ", C: " + c);
        } else {
            int x = (int)a;
            int y = (int)b;
            int z = (int)c;

            System.out.println("X: " + x + " Y: " +
                    y + " Z: " + z);
        }
    }

    public static void Method2(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(0.5 * 1 / Math.tan(x / 4) + 4);
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static void Method3(int n){
        for (int i = 0; i < n - 2; i++)
            if (IsSimpleAndTwins(n + i))
                System.out.println(n + i + " " + (n + i + 2));
    }

    private static boolean IsSimpleAndTwins(int n){
        if (n % 2 == 0)
            return false;

        for (int i = 3; i < n; i += 2)
            if (n % i == 0 || (n + 2) % i == 0)
                return false;

        return true;
    }

    public static void Method4(int n){
        int k = 1, j = 0, s = 1;
        int[][] matrix = new int[n][n];

        while(j < n * n) {
            for (int i = s - 1; i < n - (s - 1); ++i) {
                matrix[s - 1][i] = k++;
                j++;
            }

            for (int i = s; i < n - (s - 1); ++i) {
                matrix[i][n - s] = k++;
                j++;
            }

            for (int i = n - (s + 1); i >= s - 1; i--) {
                matrix[n - s][i] = k++;
                j++;
            }

            for (int i = n - (s + 1); i >= s; i--) {
                matrix[i][s - 1] = k++;
                j++;
            }

            s++;
        }

        for (int[] arr : matrix){
            for (var a : arr)
                System.out.print(a + "\t");
            System.out.println();
        }
    }
}