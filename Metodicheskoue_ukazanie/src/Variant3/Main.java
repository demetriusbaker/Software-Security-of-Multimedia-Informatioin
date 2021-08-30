package Variant3;

public class Main {
    public static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "--------------------";
        int step = 1;
        System.out.printf("%d laba\n%s\n", step++, s);

        System.out.printf("Sum: %d\n", Task.getMinInMax(7,8,9,10));
        System.out.printf("Sum: %d\n", Task.getMinInMax(2,3,4,5));
        System.out.printf("Sum: %d\n", Task.getMinInMax(465,890,125,473));

        System.out.printf("%d laba\n%s\n", step++, s);

        Task.function(0, 10, 0.5);

        System.out.printf("%d laba\n%s\n", step++, s);

        System.out.println(Task.reverseNumber(156));
        System.out.println(Task.reverseNumber(121));
        System.out.println(Task.reverseNumber(123456789));
        System.out.println(Task.reverseNumber(1));
        System.out.println(Task.reverseNumber(0));

        System.out.printf("%d laba\n%s\n", step++, s);

        printMatrix(Task.getMainDiagonalMatrix(11));
        printMatrix(Task.getMainDiagonalMatrix(6));
        printMatrix(Task.getMainDiagonalMatrix(3));
    }
}
