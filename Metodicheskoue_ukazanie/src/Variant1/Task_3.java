package Variant1;

public class Task_3 {
    public static int[] Split(int num){
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        int[] dig = new int[c.length];

        for(int i = 0; i < dig.length; i++)
            dig[i] = c[i] - '0';

        return dig;
    }
}
