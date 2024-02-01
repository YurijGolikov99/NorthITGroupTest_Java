package conditional_statements;

import java.util.Scanner;

//Условные операторы: задание 4
/*
Пользователь вводит в консоли четыре числа.
Рассчитываем и выводим в консоль количество отрицательных и положительных чисел
 */
public class QuantityNegativeAndPositiveNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4 числа: ");
        float numberOne = scanner.nextFloat();
        float numberTwo = scanner.nextFloat();
        float numberTree = scanner.nextFloat();
        float numberFour = scanner.nextFloat();

        int positiveCount = 0;
        int negativeCount = 0;

        if (numberOne > 0) {
            positiveCount++;
        } else if (numberOne < 0) {
            negativeCount++;
        }

        if (numberTwo > 0) {
            positiveCount++;
        } else if (numberTwo < 0) {
            negativeCount++;
        }

        if (numberTree > 0) {
            positiveCount++;
        } else if (numberTree < 0) {
            negativeCount++;
        }

        if (numberFour > 0) {
            positiveCount++;
        } else if (numberFour < 0) {
            negativeCount++;
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        scanner.close();
    }
}
