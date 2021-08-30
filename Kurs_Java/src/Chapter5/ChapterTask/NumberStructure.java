package Chapter5.ChapterTask;

import java.util.LinkedList;
import java.util.List;

public class NumberStructure {
    private List<Double> numbers;

    public NumberStructure(){
        numbers = new LinkedList<>();
    }

    public NumberStructure(List<Double> numbers){
        this.numbers = numbers;
    }

    public void addNumber(double value) {
        numbers.add(value);
    }

    public void deleteNumber(){
        numbers.remove(numbers.size() - 1);
    }

    public void deleteNumber(double value){
        numbers.remove(numbers.indexOf(value));
    }

    public void findSimilarNumber(double value){
        double minModul = numbers.get(0);

        for(var n : numbers)
            if (Math.abs(n - value) < Math.abs(minModul - value))
                minModul = n;

        System.out.println("Number closest to given: " + minModul);
    }

    public void getList(){
        System.out.println(numbers);
    }
}
