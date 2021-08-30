package Variant3;

public class Main {
    public static void Print_Matrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "--------------------";
        int step = 1;
        System.out.printf("%d laba\n%s\n", step++, s);

        System.out.printf("Sum: %d\n", Task.Get_Mins_In_Max(7,8,9,10));
        System.out.printf("Sum: %d\n", Task.Get_Mins_In_Max(2,3,4,5));
        System.out.printf("Sum: %d\n", Task.Get_Mins_In_Max(465,890,125,473));

        System.out.printf("%d laba\n%s\n", step++, s);

        Task.Function(0, 10, 0.5);

        System.out.printf("%d laba\n%s\n", step++, s);

        System.out.println(Task.Reverse_Number(156));
        System.out.println(Task.Reverse_Number(121));
        System.out.println(Task.Reverse_Number(123456789));
        System.out.println(Task.Reverse_Number(1));
        System.out.println(Task.Reverse_Number(0));

        System.out.printf("%d laba\n%s\n", step++, s);

        Print_Matrix(Task.Get_Main_Diagonal_Matrix(11));
        Print_Matrix(Task.Get_Main_Diagonal_Matrix(6));
        Print_Matrix(Task.Get_Main_Diagonal_Matrix(3));
    }
}
