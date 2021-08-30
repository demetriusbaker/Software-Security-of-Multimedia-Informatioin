package Chapter2.Pivass;

public class MultiSymPower {
    private char[] c;

    public MultiSymPower(char[] c){
        this.c = c;
    }

    public char[] getC(){
        return c;
    }

    public void printC(char[] c){
        for (char value : c) System.out.print(value + " ");
        System.out.println();
    }

    public void printC(){
        for (char value : this.c) System.out.print(value + " ");
        System.out.println();
    }

    private void intersect(char[] c){
        for (char value : this.c)
            for (char item : c)
                if (item == value)
                    System.out.print(value + " ");
        System.out.println();
    }

    private void union(char[] c){
        for (char value : this.c) System.out.print(value + " ");
        for (char value : c) System.out.print(value + " ");
        System.out.println();
    }

    private void residual(char[] c){
        for (char value : this.c) {
            boolean isHas = false;

            for (char item : c)
                if (item == value) {
                    isHas = true;
                    break;
                }

            if (!isHas)
                System.out.print(value + " ");
        }
        System.out.println();
    }

    public void getInfoOperations(char[] c){
        System.out.println("Intersect:");
        intersect(c);
        System.out.println("Union:");
        union(c);
        System.out.println("Residual:");
        residual(c);
    }

    public void add(char[] c){
        System.out.println("Add:");
        char[] newC = new char[this.c.length + c.length];

        for (int i = 0; i < newC.length; i++)
            newC[i] = i < this.c.length ? this.c[i] : c[i - this.c.length];

        this.c = newC;
    }

    public void subtract(char[] c){
        System.out.println("Subtract:");
        int countBuf = 0;
        char[] buffer = new char[this.c.length];

        for (int i = 0; i < buffer.length; i++){
            boolean isHas = false;

            for (char value : c)
                if (value == this.c[i]) {
                    isHas = true;
                    break;
                }

            if (!isHas)
                buffer[countBuf++] = this.c[i];
        }

        this.c = new char[countBuf];

        System.arraycopy(buffer, 0, this.c, 0, this.c.length);
    }

    public void multiply(char[] c){
        System.out.println("Multiply:");
        int countBuf = 0;
        char[] buffer = new char[Math.max(this.c.length, c.length)];

        for (char value : this.c) {
            for (char item : c)
                if (item == value) {
                    buffer[countBuf++] = item;
                    break;
                }
        }

        this.c = new char[countBuf];

        System.arraycopy(buffer, 0, this.c, 0, this.c.length);
    }

    public void findElementByIndex(int index){
        int i = index < this.c.length ? index : 0;
        System.out.printf("Index: %d value: %c\n", i, this.c[i]);
    }

    public void toAssignment(int index, char sym){
        System.out.println("Changed:");
        this.c[index < this.c.length ? index : 0] = sym;
    }

    public static class InnerTool{
        public static char[] GetDeal(MultiSymPower o1, MultiSymPower o2, boolean isFirst){
            char[] c1 = o1.getC(), c2 = o2.getC();
            MultiSymPower msp = new MultiSymPower(isFirst ? c1 : c2);
            msp.subtract(isFirst ? c2 : c1);
            return msp.getC();
        }
    }
}