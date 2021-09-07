package Chapter34.Arithmetic;

import java.util.Scanner;

public class Strings implements IArithmetic {
    private char[] c;

    public Strings(){
        System.out.print("Enter: ");
        Scanner s = new Scanner(System.in);
        c = s.nextLine().toCharArray();
    }

    public void outputValueByIndex(int i){
        if (i < c.length)
            System.out.printf("Value of index %d: %c\n", i, c[i]);
    }

    @Override
    public void add(Object value) {
        char[] c = (char[]) value;
        String s = String.valueOf(c);
        String thisS = String.valueOf(this.c);
        this.c = thisS.concat(s).toCharArray();
    }

    @Override
    public void compare(Object value) {
        char[] c = (char[]) value;
        boolean isEqual = true;

        try{
            if (this.c.length != c.length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.c.length; i++)
                if (this.c[i] != c[i]){
                    isEqual = false;
                    break;
                }

            if (isEqual)
                System.out.println("Equals!");
            else
                System.out.println("Is not equals!");
        } catch (SizeMismatchExceptionClass sme) {
            System.out.println(sme);
        }
    }

    public void printSymbols(){
        for (char value : c) System.out.print(value);
        System.out.println();
    }

    public char[] getC() {
        return c;
    }
}
