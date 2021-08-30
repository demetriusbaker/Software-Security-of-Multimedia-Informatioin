package Variant2;

public class Main {
    static void Print_Matrix(int[][] matrix){
        for (int[] array : matrix) {
            for (int a : array)
                System.out.print(a + "\t");
            System.out.println();
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        int number = 1;
        String s = "--------------------";

        System.out.printf("№%d %s\n", number++, s);

        double[][] triangles = {
                {5,6,9},
                {3,5,4},
                {13,12,5},
                {150, 200, 250},
                {4,6,5},
        };

        for (int i = 0; i < triangles.length; i++){
            double result = Task.findAngleC(triangles[i][0], triangles[i][1], triangles[i][2]);

            if (result == Math.PI / 2)
                System.out.println("This triangle is right! <C = 90 grad");
            else
                System.out.println("<C = " + result * 180 / Math.PI + " grad");
        }

        System.out.printf("№%d %s\n", number++, s);

        Task.function(1, 2, 0.25);

        System.out.printf("№%d %s\n", number++, s);

        System.out.println(Task.moreDigits(234,3242));
        System.out.println(Task.moreDigits(54,63));
        System.out.println(Task.moreDigits(50, 50));
        System.out.println(Task.moreDigits(34125647, 85476));
        System.out.println(Task.moreDigits(123456789, 70924));

        System.out.printf("№%d %s\n", number++, s);

        Print_Matrix(Task.generateArray(3));
        Print_Matrix(Task.generateArray(4));
        Print_Matrix(Task.generateArray(5));
        Print_Matrix(Task.generateArray(0));
        Print_Matrix(Task.generateArray(2));
    }
}
