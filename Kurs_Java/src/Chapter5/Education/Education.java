package Chapter5.Education;

import java.util.*;

public class Education {
    public static void showExample1(){
        Gen<Integer> integerObject = new Gen<Integer>(88);
        integerObject.ShowType();

        int value = integerObject.GetObject();
        System.out.println("Value: " + value);
        System.out.println();

        Gen<String> stringObject = new Gen<String>("Hi!");
        stringObject.ShowType();

        String str = stringObject.GetObject();
        System.out.println("Value: " + str);
        System.out.println();
    }

    public static void showExample2(){
        TwoGens<Integer, String> objects = new TwoGens<Integer, String>(100, "Words");
        objects.showTypes();

        int value = objects.GetOb1();
        String str = objects.GetOb2();

        System.out.println("Value: " + value);
        System.out.println("Value: " + str);
        System.out.println();

        // TwoGens<String, String> x = new TwoGens<String, String>("A",  "B");
    }

    public static void showExample3(){
        NumericFns<Integer> iob = new NumericFns<Integer>(125);
        System.out.println("Reciprocal of iob is " + iob.toReciprocal());
        System.out.println("Fractional component of iob is "+ iob.toFraction());
        System.out.println();

        NumericFns<Double> dob = new NumericFns<Double>(2.5);
        System.out.println("Reciprocal of dob is " + dob.toReciprocal());
        System.out.println("Fractional component of dob is "+ dob.toFraction());
        System.out.println();

        // Следующая строка кода не будет компилироваться,
        // поскольку String не является подклассом Number
        // NumericFns<String> strOb = new NumericFns<String>("Error");
    }

    public static void showExample4(){
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);

        System.out.println("iOb and doB equals are " + iOb.absEqual(dOb));
        System.out.println("iOb and loB equals are " + iOb.absEqual(lOb));
        System.out.println();
    }

    public static void showExample5(){
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};
        Double dvals[] = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("nums are equals nums: " +
                GenericMethodDemo.toCompareArrays(nums, nums));
        System.out.println("nums are equals nums2: " +
                GenericMethodDemo.toCompareArrays(nums, nums2));
        System.out.println("nums are equals nums3: " +
                GenericMethodDemo.toCompareArrays(nums, nums3));
        System.out.println("nums are equals nums4: " +
                GenericMethodDemo.toCompareArrays(nums, nums4));
        System.out.println("nums are equals dvals: " +
                GenericMethodDemo.toCompareArrays(nums, dvals));
        System.out.println();
    }

    public static void showExample6(){
        Summation ob = new Summation(4.0f);
        System.out.println("Summation of 4.0 is " + ob.getSum());
        System.out.println();
    }

    public static void showExample7(){
        Integer[] x = {1, 2, 3};
        MyClass<Integer> ob = new MyClass<Integer>(x);

        System.out.println("2 is in ob? " + ob.contains(2));
        System.out.println("5 is in ob? " + ob.contains(5));

        Double[] y = {2.5, 3.14, 6.79};
        MyClass<Double> ob2 = new MyClass<Double>(y);

        System.out.println("3.14 is in ob? " + ob2.contains(3.14));
        System.out.println("42.43 is in ob? " + ob2.contains(7.03));
        System.out.println();
    }

    public static void showExample8(){
        ArrayList al = new ArrayList();

        System.out.printf("Size: %d\n", al.size());

        al.add("123");
        al.add(34);
        al.add('c');
        al.add(true);
        al.add(3.14f);

        for (var a : al)
            System.out.println(a);
        System.out.println();

        System.out.printf("Size: %d\n", al.size());

        al.add(3, false);
        al.add(134);

        for (var a : al)
            System.out.println(a);
        System.out.println();

        System.out.printf("Size: %d\n", al.size());

        al.remove("123");
        al.remove(false);

        for (var a : al)
            System.out.println(a);
        System.out.println();

        System.out.printf("Size: %d\n", al.size());
    }

    public static void showExample9(){
        HashSet hs = new HashSet();
        hs.add(123);
        hs.add("Hello");
        hs.add(10);
        hs.add(5);
        hs.add('A');
        hs.add(true);
        System.out.println(hs);
    }

    public static void showExample10(){
        TreeSet ts = new TreeSet();
        ts.add(123);
        ts.add(243);
        ts.add(10);
        ts.add(5);
        ts.add(43);
        ts.add(1);
        ts.add(314);
        System.out.println(ts);

        // Невозможно отсортировать объекты разного класса!
    }

    public static void showExample11(){
        TreeSet ts = new TreeSet();
        ts.add(new Circle(3.14));
        ts.add(new Circle(24.234));
        ts.add(new Circle(21.06));
        ts.add(new Circle(7.56));
        ts.add(new Circle(8.9));
        System.out.println(ts);
    }

    public static void showExample12(){
        ArrayList al = new ArrayList();
        al.add("milk");
        al.add("bread");
        al.add("butter");
        al.add("beer");
        al.add("eggs");
        al.add("meat");
        al.add("ice-cream");
        al.add("cookie");
        al.add("cheeps");

        System.out.println("Default contain al: ");

        Iterator i = al.iterator();

        while (i.hasNext()){
            Object el = i.next();
            System.out.print(el + " ");
        }
        System.out.println();

        ListIterator li = al.listIterator();

        while (li.hasNext()){
            Object el = li.next();
            li.set(el + "+");
        }

        System.out.println("Modified contain al: ");

        i = al.iterator();

        while (i.hasNext()){
            Object el = i.next();
            System.out.print(el + " ");
        }

        System.out.println();

        // теперь показать список в обратном порядке

        System.out.println("Modified reverse contain al: ");

        while (li.hasPrevious()){
            Object el = li.previous();
            System.out.print(el + " ");
        }

        System.out.println();
    }
}

class Gen<Type> {
    private Type ob;

    public Gen(Type ob){
        this.ob = ob;
    }

    public Type GetObject() {
        return ob;
    }

    public void ShowType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class TwoGens<T,V>{
    private T ob1;
    private V ob2;

    public TwoGens(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public void showTypes(){
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    public T GetOb1(){
        return ob1;
    }

    public V GetOb2(){
        return ob2;
    }
}

class NumericFns<T extends Number>{
    private T number;

    public NumericFns(T number){
        this.number = number;
    }

    public double toReciprocal(){
        return 1 / number.doubleValue();
    }

    public double toFraction(){
        return number.doubleValue() - number.intValue();
    }

    public boolean absEqual(NumericFns<?> ob){
        return Math.abs(number.doubleValue()) ==
                Math.abs(ob.number.doubleValue());
    }
}

class GenericMethodDemo {
    public static <T, V extends T> boolean toCompareArrays(T[] x, V[] y){
        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false;

        return true;
    }
}

class Summation {
    private int sum;

    public <T extends Number> Summation(T arg){
        for (int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }

    public int getSum(){
        return sum;
    }
}

interface Containment<T> {
    public boolean contains(T o);
}

class MyClass<T> implements Containment<T>{
    private T[] arrayRef;

    public MyClass(T[] arrayRef){
        this.arrayRef = arrayRef;
    }

    @Override
    public boolean contains(T o) {
        for (var x : arrayRef)
            if (x.equals(o))
                return true;

        return false;
    }
}

class MyGenClass<T,V>{
    private T o1;
    private V o2;
    // Два следующих метода конфликтуют друг с другом
    // поэтому код не компилируется
    /*
    public void set(T o){
        o1 = o;
    }
     */
    public void set(V o){
        o2 = o;
    }
}

class GenTwo{
    // private T ob;
    // Экземпляр T создать невозможно
    public GenTwo(){
       // ob = new T();
    }
}

class GenThree <T extends Number>{
    private T ob;
    private T vals[];

    public GenThree(T ob, T[] vals){
        this.ob = ob;
        this.vals = vals;
        // Следующее выражение недопустимо
        //  vals = new T[10]; // Невозможно создать массив типа T
        // Следующее выражение корректно
        // vals = nums; // Переменной можно присваивать ссылку на
        // существующий массив
    }
}

class Circle implements Comparable<Circle>{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle c) {
        return (int) (this.radius - c.radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius = " + radius + '}';
    }
}











