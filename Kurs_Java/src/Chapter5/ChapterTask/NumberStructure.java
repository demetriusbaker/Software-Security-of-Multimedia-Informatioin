package Chapter5.ChapterTask;

import java.util.LinkedList;
import java.util.List;

public class NumberStructure {
    private final List<Double> numbers;

    public NumberStructure(){
        numbers = new LinkedList<>();
    }

    public void addNumber(double value) {
        numbers.add(value);
    }

    public void deleteNumber(){
        numbers.remove(numbers.size() - 1);
    }

    public void deleteNumber(double value){
        numbers.remove(value);
    }

    public void findSimilarNumber(double value){
        double minModule = numbers.get(0);

        for(var n : numbers)
            if (Math.abs(n - value) < Math.abs(minModule - value))
                minModule = n;

        System.out.println("Number closest to given: " + minModule);
    }

    public void getList(){
        System.out.println(numbers);
    }
}
