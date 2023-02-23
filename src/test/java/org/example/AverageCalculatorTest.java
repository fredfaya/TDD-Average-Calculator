package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.List;

public class AverageCalculatorTest {

    @Test
    public void calculateAverageShouldThrowExceptionWhenEntryNull(){

        //given
        List input = null;
        //When
        Executable action = () -> {
            AverageCalculator.calculateAverage(input);
        };
        //Then
        Assertions.assertThrows(InvalidInputException.class,action);
    }

    @Test
    public void calculateAverageShouldReturnFirstElementWhenInputHasOneElement(){

        //given
        List input = Arrays.asList(0d);
        //When
        Double result = AverageCalculator.calculateAverage(input);
        //Then
        Assertions.assertEquals(0d, result);
    }

    @Test
    public void calculateAverageShouldReturn5WhenInputHasElements7and3(){

        //given
        List input = Arrays.asList(7d,3d);
        //When
        Double result = AverageCalculator.calculateAverage(input);
        //Then
        Assertions.assertEquals(5d, result);
    }

    @Test
    public void calculateAverageShouldReturn5WhenInputHasElements7and3and5(){

        //given
        List input = Arrays.asList(7d,3d,5d);
        //When
        Double result = AverageCalculator.calculateAverage(input);
        //Then
        Assertions.assertEquals(5d, result);
    }
}
