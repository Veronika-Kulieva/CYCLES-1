package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalcmonthServiceTest {
    @Test
    public void testWhenRest3Monts() {
        CalcmonthService service = new CalcmonthService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual); // сначала ожидаемый результат, потом фактический

    }

    @Test
    public void testWhenRest2Monts() {
        CalcmonthService service = new CalcmonthService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual); // сначала ожидаемый результат, потом фактический

    }

    @ParameterizedTest
    @CsvFileSource(resources = "data_test.csv")
    public void testWithParams(int income, int expenses, int threshold, int expected) {
        CalcmonthService service = new CalcmonthService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}