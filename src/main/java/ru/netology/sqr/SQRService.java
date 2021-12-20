package ru.netology.sqr;

public class SQRService {

    public static void main (String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (i * i > 300) {
                if (i * i < 800)
                System.out.println("Проход в цикле " + i);
            }
        }
        System.out.println("Выход из цикла");
    }
}

