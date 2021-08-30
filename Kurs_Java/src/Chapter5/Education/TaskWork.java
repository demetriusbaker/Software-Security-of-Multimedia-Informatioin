package Chapter5.Education;

import java.util.ArrayList;
import java.util.List;

public class TaskWork {
    public static void showTask53(){
        int a = 25;
        float b = 3.14f;
        Integer[] C = {1,2,4,6,9};
        Double[] D = {1.0,2.3,4.0,6.1,9.0001342};

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        for (var c : C)
            System.out.print(c + " ");
        System.out.println();
        for (var d : D)
            System.out.print(d + " ");
        System.out.println();

        System.out.println();

        Numbers<Integer, Float> n = new Numbers<Integer, Float>(a, b);

        System.out.println("Sum: " + n.add());
        System.out.println();

        Numbers<Integer, Double> n1 = new Numbers<Integer, Double>(C, D);

        n1.equalsArraysElements();
        n1.printInfoMaxAndMinArrayElements();
        System.out.println();
    }

    public static void showTask56(){
        QueueClass qc = new QueueClass(3);
        qc.printInfo();
        qc.set(new ValuesClass<Float>(3.14f));
        qc.set(new ValuesClass<Character>('c'));
        qc.set(new ValuesClass<Boolean>(true));
        qc.set(new ValuesClass<Integer>(0));
        System.out.println("+++");
        qc.printInfo();
        System.out.println("+++");
        qc.get();
        qc.get();
        qc.get();
        qc.get();
        qc.get();
        qc.get();
        qc.get();
        System.out.println("+++");
        qc.set(new ValuesClass<String>("Hello world"));
        qc.set(new ValuesClass<Integer>(0));
        qc.printInfo();
    }

    public static void showTask591(){
        ArrayList al1 = new ArrayList<>();
        al1.add(3);
        al1.add(true);
        al1.add("Beer");

        ArrayList al2 = new ArrayList<>();
        al2.add('c');
        al2.add(3.14f);
        al2.add(42536478);

        CollectionMethods cm1 = new CollectionMethods(al1);

        System.out.println("First list:");
        cm1.printResult();

        System.out.println("Second list:");
        cm1.printResult(al2);

        cm1.toUniteCollections(al2);

        System.out.println("United list:");
        cm1.printResult();

        System.out.println("+++++");

        ArrayList al3 = new ArrayList();
        al3.add(true);
        al3.add(453.234);
        al3.add('s');
        al3.add(5);
        al3.add(8);
        al3.add(13);

        ArrayList al4 = new ArrayList();
        al4.add(true);
        al4.add(8);
        al4.add(1343);
        al4.add(5.25);

        CollectionMethods cm2 = new CollectionMethods(al3);

        System.out.println("First list:");
        cm2.printResult();

        System.out.println("Second list:");
        cm2.printResult(al4);

        cm2.toIntersectCollections(al4);

        System.out.println("Intersected list:");
        cm2.printResult();

        System.out.println("+++++");
    }
}

class Numbers<T extends Number, V extends Number>{
    private T number1;
    private V number2;
    private T[] arr1;
    private V[] arr2;

    public Numbers(T number1, V number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public Numbers(T[] arr1, V[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public double add(){
        return number1.doubleValue() + number2.doubleValue();
    }

    public void equalsArraysElements(){
        if(arr1.length != arr2.length)
            System.out.println("Не одинаковая размерность! Сравнение невозможно");
        else {
            for (int i = 0; i < arr1.length; i++){
                if(arr1[i].doubleValue() == arr2[i].doubleValue())
                    System.out.println("Элементы с индексом " + (i + 1) + " равны");
                else
                    System.out.println("Элементы с индексом " + (i + 1) + " не равны");
            }
        }
    }

    public void printInfoMaxAndMinArrayElements(){
        T min1 = arr1[0];
        T max1 = arr1[0];
        V min2 = arr2[0];
        V max2 = arr2[0];

        for (T t : arr1) {
            if (max1.doubleValue() < t.doubleValue())
                max1 = t;
            if (min1.doubleValue() > t.doubleValue())
                min1 = t;
        }

        for (V v : arr2) {
            if (max2.doubleValue() < v.doubleValue())
                max2 = v;
            if (min2.doubleValue() > v.doubleValue())
                min2 = v;
        }

        System.out.println("Max element of first arr: " + max1);
        System.out.println("Min element of first arr: " + min1);
        System.out.println("Max element of second arr: " + max2);
        System.out.println("Min element of second arr: " + min2);
        System.out.println();
    }
}

class ValuesClass<T>{
    private T value;

    public ValuesClass(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

class QueueClass {
    private int size;
    private List<ValuesClass> queue = new ArrayList<>();

    public QueueClass(int size){
        this.size = size;
    }

    public void set(ValuesClass value){
        try{
            if (size < queue.size())
                throw new SizeUnderFlowExceptionClass();
            queue.add(value);
        } catch (SizeUnderFlowExceptionClass sizeUnderFlowExceptionClass) {
            System.out.println(sizeUnderFlowExceptionClass);
        }
    }

    public void get(){
        try{
            if (queue.isEmpty())
                throw new SizeOverFlowExceptionClass();
            queue.remove(queue.size() - 1);
        } catch (SizeOverFlowExceptionClass sizeOverFlowExceptionClass) {
            System.out.println(sizeOverFlowExceptionClass);
        }
    }

    public void printInfo(){
        try{
            if (queue.isEmpty())
                throw new SizeUnderFlowExceptionClass();
            System.out.println("OUT:");
            for (var q : queue)
                System.out.println(q.getValue());
            System.out.println();
        } catch (SizeUnderFlowExceptionClass sizeUnderFlowExceptionClass) {
            System.out.println(sizeUnderFlowExceptionClass);
        }
    }
}

class SizeUnderFlowExceptionClass extends Exception{
    @Override
    public String toString(){
        return "Error: deque is empty!!!";
    }
}

class SizeOverFlowExceptionClass extends Exception{
    @Override
    public String toString(){
        return "Error: deque is out of size!!!";
    }
}

class CollectionMethods{
    private ArrayList al = new ArrayList<>();

    public CollectionMethods(ArrayList al){
        this.al = al;
    }

    public void toUniteCollections(ArrayList al){
        this.al.addAll(al);
    }

    public void toIntersectCollections(ArrayList al){
        this.al.retainAll(al);
    }

    public void printResult(){
        for (var l : this.al)
            System.out.println(l);
    }

    public void printResult(ArrayList al){
        for (var l : al)
            System.out.println(l);
        System.out.println();
    }
}







