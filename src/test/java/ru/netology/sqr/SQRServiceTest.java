package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'correct data',200,300,3",
            "'crash test',200,300,7",
            "'big data',7744,9999,12",
            "'small data',100,150,3",
            "'min and max are equal',400,400,1",
            "'min are bigger then max',400,200,0"
            })
    void shouldCalculate(String testName, int min, int max, int expected) {

        SQRService service = new SQRService();

        int actual = service.calculate(min,max);

        assertEquals(expected,actual);

    }
}