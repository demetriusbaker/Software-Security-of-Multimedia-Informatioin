package Variant4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "--------------------";
        int step = 1;
        System.out.printf("%d laba\n%s\n", step++, s);

        System.out.println(Task.getRes3Num(1,2,3,1)); // 1
        System.out.println(Task.getRes3Num(1,2,3,2)); // 2
        System.out.println(Task.getRes3Num(2,3,4,4)); // 4
        System.out.println(Task.getRes3Num(10,8,4,5)); // 1
        System.out.println(Task.getRes3Num(10,14,12,16)); // 6

        System.out.printf("%d laba\n%s\n", step++, s);

        Task.function(0, 3.14f, 0.3f);

        System.out.printf("%d laba\n%s\n", step++, s);

        int[] arr = Task.createArrayWithKN(10,100);
        for (var a: arr)
            System.out.print(a + " ");
        System.out.println();

        System.out.printf("%d laba\n%s\n", step++, s);

        int[][] matrix = Task.formMatrix(5);
        for (var matr: matrix){
            for (var m: matr)
                System.out.print(m + " ");
            System.out.println();
        }
    }
}
