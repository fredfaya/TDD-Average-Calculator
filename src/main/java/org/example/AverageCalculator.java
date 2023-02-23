package org.example;

import java.util.List;

public class AverageCalculator {
    public static Double calculateAverage(List<Double> input) {
        if (input == null){
            throw new InvalidInputException();
        }
        Double sum = input.stream().reduce(0d,(a,b)-> a+b);
        return sum/input.size();
    }
}
