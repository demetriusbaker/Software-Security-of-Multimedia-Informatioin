package Chapter2.Pivass;

public class MultiSymPower {
    private char[] c;

    public MultiSymPower(){
        c = new char[]{'a', 'b', 'c', 'd', 'e'};
    }

    public MultiSymPower(char[] c){
        this.c = c;
    }

    public char[] getC(){
        return c;
    }

    public void printC(char[] c){
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }

    public void printC(){
        for (int i = 0; i < this.c.length; i++)
            System.out.print(this.c[i] + " ");
        System.out.println();
    }

    private void intersect(char[] c){
        for (int i = 0; i < this.c.length; i++)
            for (int j = 0; j < c.length; j++)
                if (c[j] == this.c[i])
                    System.out.print(this.c[i] + " ");
        System.out.println();
    }

    private void union(char[] c){
        for (int i = 0; i < this.c.length; i++)
            System.out.print(this.c[i] + " ");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }

    private void residual(char[] c){
        for (int i = 0; i < this.c.length; i++){
            boolean isHas = false;

            for (int j = 0; j < c.length; j++)
                if (c[j] == this.c[i]){
                    isHas = true;
                    break;
                }

            if (!isHas)
                System.out.print(this.c[i] + " ");
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
        char[] bufer = new char[this.c.length];

        for (int i = 0; i < bufer.length; i++){
            boolean isHas = false;

            for (int j = 0; j < c.length; j++)
                if (c[j] == this.c[i]){
                    isHas = true;
                    break;
                }

            if (!isHas)
                bufer[countBuf++] = this.c[i];
        }

        this.c = new char[countBuf];

        for (int i = 0; i < this.c.length; i++)
            this.c[i] = bufer[i];
    }

    public void multiply(char[] c){
        System.out.println("Multiply:");
        int countBuf = 0;
        char[] bufer = new char[Math.max(this.c.length, c.length)];

        for (int i = 0; i < this.c.length; i++){
            for (int j = 0; j < c.length; j++)
                if (c[j] == this.c[i]){
                    bufer[countBuf++] = c[j];
                    break;
                }
        }

        this.c = new char[countBuf];

        for (int i = 0; i < this.c.length; i++)
            this.c[i] = bufer[i];
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