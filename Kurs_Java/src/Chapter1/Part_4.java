package Chapter1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.random;

public class Part_4 {
    public static void solve_31(){
        Scanner s = new Scanner(System.in);
        int n;

        do{
            System.out.print("Enter natural number more than 2: ");
            while (!s.hasNextInt())
                s.next();
            n = s.nextInt();
        } while (n < 3);

        int[] arr = new int[n];
        var new_arr = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(random() * (n + 1));
            System.out.printf("%d\t", arr[i]);

            if (arr[i] % 2 == 0)
                new_arr.add(arr[i]);
        }
        System.out.println();

        for (var a:
                new_arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
    }

    public static void solve_32(){
        int[][] matrix = new int[6][7];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] =(int)(random() * 10);

        for (int[] mat: matrix){
            for (var m: mat)
                System.out.print(m + "\t");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            int max = matrix[i][0], maxI = 0;

            for (int j = 0; j < matrix[i].length; j++){
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    maxI = j;
                }
            }

            int buf = matrix[i][maxI];
            matrix[i][maxI] = matrix[i][0];
            matrix[i][0] = buf;
        }

        for (int[] mat: matrix){
            for (var m: mat)
                System.out.print(m + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void solve_33(){
        int[][] stud = new int[15][3];
        for (int i = 0; i < stud.length; i++)
            for (int j = 0; j < stud[i].length; j++){
                stud[i][j] = 2 + (int)(random() * 8);

                if (j == stud[i].length - 1){
                    stud[i][j] = stud[i][j - 2] * stud[i][j - 1];

                    for (int k = 0; k < i; k++)
                        if (stud[i][j] == stud[k][j])
                            if (stud[i][j - 1] == stud[k][j - 1] ||
                            stud[i][j - 2] == stud[k][j - 2]) --i;
                }
            }

        for(int i = 0; i < stud.length; i++){
            System.out.print("Task №" + (i + 1) + ": ");
            for(int j = 0; j < stud[i].length; j++){
                if(j == 0)
                    System.out.print(stud[i][j] + " * ");
                if(j == 1)
                    System.out.println(stud[i][j]);
            }
        }
    }

    public static void solve_34(int n){
        int[][] matrix = new int[n][n];
        int sum = 0, amount = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] =(int)(random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

            for(int j = 0; j < n - i - 1; j++) {
                sum += matrix[i][j];
                amount++;
            }
        }

        System.out.printf("Sum: %d, amount: %d\n", sum, amount);
    }

    public static void solve_35(int p, int t) {
        int[][] A = new int[p][t];
        int k = 0, sumCols = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int)(random() * 201) - 100;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }


        for (int i = 0; i < A[0].length; i++){
            for (int[] a : A)
                sumCols += a[i];

            for (int[] a : A)
                if (a[i] > sumCols - a[i])
                    k++;

            sumCols = 0;
        }

        System.out.printf("Amount of k: %d\n", k);
    }

    public static void solve_36(int n){
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int maxMD = matrix[0][n - 1], max_X = n - 1, max_Y = 0;
        for (int i = 0; i < n; i++)
            if (maxMD < matrix[i][n - 1 - i]){
                max_X = n - 1 - i;
                max_Y = i;
            }

        System.out.printf("Max Main Diagonal Element: %d, position: (%d,%d)\n", maxMD, max_X + 1, max_Y + 1);

        Scanner s = new Scanner(System.in);
        int userRow = 0;
        do{
            System.out.printf("Enter № of row (from 1 to %d): ", n);
            while (!s.hasNextInt())
                s.next();
            userRow = s.nextInt() - 1;
        } while (userRow < 0 || userRow >= n);

        for (int i = 0; i < n; i++){
            int buf = matrix[max_Y][i];
            matrix[max_Y][i] = matrix[userRow][i];
            matrix[userRow][i] = buf;
        }

        System.out.println("Changed Matrix!");

        for(int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static void solve_37(int n, int m){
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Changed Matrix!");

        for(int i = 0; i < n; i++){
            int max = matrix[i][0], min = matrix[i][0],
                    maxIndex = 0, minIndex = 0;

            for (int j = 0; j < m; j++){
                if (max < matrix[i][j]){
                    maxIndex = j;
                    max = matrix[i][j];
                }

                if (min > matrix[i][j]){
                    minIndex = j;
                    min = matrix[i][j];
                }
            }

            matrix[i][maxIndex] = matrix[i][0];
            matrix[i][0] = max;

            matrix[i][minIndex] = matrix[i][m - 1];
            matrix[i][m - 1] = min;
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static void solve_38(int[][] matrix){
        if (matrix.length == matrix[0].length){
            int[] rows = new int[matrix.length];
            int[] cols = new int[matrix.length];
            int[] dig1 = new int[matrix.length];
            int[] dig2 = new int[matrix.length];
            int d1 = 0, d2 = 0;
            boolean isCaREquals = true;

            for (int i = 0; i < matrix.length; i++){
                dig1[i] = matrix[matrix.length - 1 - i][i];
                dig2[i] = matrix[i][i];

                for (int j = 0; j < matrix.length; j++){
                    rows[i] += matrix[i][j];
                    cols[i] += matrix[j][i];
                }
            }

            for (int i = 0; i < matrix.length; i++){
                d1 += dig1[i];
                d2 += dig2[i];
            }

            for (int i = 0; i < matrix.length - 1; i++)
                for (int j = 0; j < matrix.length; j++)
                    if (rows[i] != cols[j] || rows[j] != cols[i]) {
                        isCaREquals = false;
                        break;
                    }

            if (isCaREquals && d1 == d2)
                System.out.println("It's magic square!");
            else
                System.out.println("It's not magic square!");
        }
    }

    public static void solve_39(int n, int t){
        int[][] matrix = new int[n][t];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                matrix[i][j] = (int)(random() * 201) - 100;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int k = matrix[0][0], k_x = 0, k_y = 0;

        for(int i = 0; i < n; i++)
            for (int j = 0; j < t; j++)
                if (abs(k) < abs(matrix[i][j])){
                    k = matrix[i][j];
                    k_x = j;
                    k_y = i;
                }

        System.out.printf("MAX pos: (%d,%d)\n", k_x, k_y);
        System.out.println("Changed Matrix!");

        if (n == t)
        for (int it = 0; it < n; it++){
            int buf = matrix[k_y][it];
            matrix[k_y][it] = matrix[it][k_x];
            matrix[it][k_x] = buf;
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void solve_40(int n){
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int pos = (int)(random() * 2);
                int one = pos == 1 ? 1 : -1;
                matrix[i][j] = one * (1 + (int)(random() * 10));
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                matrix[i][j] = matrix[i][j] > 0 ? 1 : 0;
            }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
