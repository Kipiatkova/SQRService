package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRService {
    private Object SQRService;

    @ParameterizedTest
 @CsvSource(value = {"300, 800",
 "1, 99"})
     void shouldCalculateSQR (int a, int b) {
     SQRService = new SQRService();
        for (int i = 10; i <= 99; i++) {
            if (i * i > a) {
                if (i * i < b)
                System.out.println("Проход в цикле " + i);
            }
        }
        System.out.println("Выход из цикла");
    }
}

