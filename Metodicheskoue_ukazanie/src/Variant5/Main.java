package Variant5;

public class Main {

    public static void main(String[] args) {
        String s = "--------------------";
        int step = 1;
        System.out.printf("%d task\n%s\n", step++, s);

        System.out.println(Task.isParallelogram(1,1, 3,3, 6,3, 4, 1));
        System.out.println(Task.isParallelogram(1,2, 3,4, 5,6, 7, 8));

        System.out.printf("%d task\n%s\n", step++, s);

        Task.Get_Function(0, 5.5f, 0.5f);

        System.out.printf("%d task\n%s\n", step++, s);

        int[][] A = {
                {1,2,4},
                {1,0,-6},
                {5,3,2}
        };

        int[][] B = {
                {3,-9},
                {8,7}
        };

        int[][] C = {
                {4,5},
                {3,5},
                {6,2},
                {1,3},
        };

        Task.Print_MatrixWMN(A, B, C);

        System.out.printf("%d task\n%s\n", step++, s);

        Task.Create_And_Print_Matrix_N(6);
    }
}
