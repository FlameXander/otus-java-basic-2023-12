package ru.otus.java.basic.lesson4;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
    }

    public static void simpleConsoleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число");
        float b = scanner.nextFloat();
        System.out.println("Введите операцию +, -, *, /");
        char operation = scanner.next().charAt(0);
        float result;
        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            result = a / b;
        } else {
            System.out.println("Введена неизвестная операция");
            return;
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }

    public static void hardAiNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Игра угадай число ***");
        while (true) {
            int difficulty;
            do {
                System.out.println("Выберите сложность:\n1 - легко\n2 - средне\n3 - сложно");
                difficulty = scanner.nextInt();
            } while (difficulty < 1 || difficulty > 3);
            int triesCount;
            int maxNumber;
            if (difficulty == 1) {
                maxNumber = 6;
                triesCount = 3;
            } else if (difficulty == 2) {
                maxNumber = 9;
                triesCount = 3;
            } else {
                maxNumber = 15;
                triesCount = 2;
            }
            int aiNumber = (int) (Math.random() * maxNumber) + 1;
            System.out.println("Игра началась. Компьютер загадал число от 1 до " + maxNumber + ". У вас " + triesCount + " попыток");
            while (true) {
                int answer;
                do {
                    System.out.println("Введите число от 1 до " + maxNumber);
                    answer = scanner.nextInt();
                } while (answer < 1 || answer > maxNumber);
                if (answer == aiNumber) {
                    System.out.println("Вы победили!");
                    break;
                }
                triesCount--;
                if (answer > aiNumber) {
                    System.out.println("Загаданное число меньше. Осталось попыток: " + triesCount);
                } else {
                    System.out.println("Загаданное число больше. Осталось попыток: " + triesCount);
                }
                if (triesCount == 0) {
                    System.out.println("Вы проиграли! Загаданное число: " + aiNumber);
                    break;
                }
            }
            System.out.println("Раунд закончен");
            System.out.println("Хотите ли повторить? Введите y для повтора");
            String retryAnswer = scanner.next();
            if (!retryAnswer.equals("y")) {
                System.out.println("Игра завершена");
                break;
            }
        }
    }

    public static void simpleAiNumber() {
        Scanner scanner = new Scanner(System.in);
        int aiNumber = (int) (Math.random() * 9) + 1;
        int answer;
        do {
            System.out.println("Введите число от 1 до 9");
            answer = scanner.nextInt();
        } while (answer < 1 || answer > 9);
        if (answer == aiNumber) {
            System.out.println("Вы победили!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }
}
