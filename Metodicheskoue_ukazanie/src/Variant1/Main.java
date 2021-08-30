package Variant1;

public class Main {
    public static void Show_Array(int[] arr, boolean vertical){
        for (int i = 0; i < arr.length; i++){
            if (vertical)
                System.out.println(arr[i]);
            else{
                System.out.printf("%d ", arr[i]);
                if (i == arr.length - 1)
                    System.out.println();
            }
        }
    }

    public static void Show_Matrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
	    // write your code here

        int result = Task_1.GetSumOfMaxAndMin(5,2,8);
        System.out.printf("max - min: %d\n", result);

        System.out.println("-----------------");

        Task_2.Function(2.5, 10.6, 0.25f);

        System.out.println("-----------------");

        int[] arr = Task_3.Split(1092837465);
        Show_Array(arr, false);
        Show_Array(arr, true);

        System.out.println("-----------------");

        double[][] matrix = Task_4.FormSquareMatrixAndGetPositive(5);
        int positive_count = Task_4.GetPositiveElementsOfMatrix(matrix);
        Show_Matrix(matrix);
        System.out.printf("Amount of positive: %d\n", positive_count);
    }
}
