package Variant1;

public class Main {
    public static void showArray(int[] arr, boolean vertical){
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

    public static void showMatrix(double[][] matrix){
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(doubles[j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
	    // write your code here

        int result = Task_1.getSumOfMaxAndMin(5,2,8);
        System.out.printf("max - min: %d\n", result);

        System.out.println("-----------------");

        Task_2.function(2.5, 10.6, 0.25f);

        System.out.println("-----------------");

        int[] arr = Task_3.split(1092837465);
        showArray(arr, false);
        showArray(arr, true);

        System.out.println("-----------------");

        double[][] matrix = Task_4.formSquareMatrixAndGetPositive(5);
        int positive_count = Task_4.getPositiveElementsOfMatrix(matrix);
        showMatrix(matrix);
        System.out.printf("Amount of positive: %d\n", positive_count);
    }
}
