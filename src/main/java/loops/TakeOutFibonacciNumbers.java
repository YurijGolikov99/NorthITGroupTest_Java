package loops;

import java.util.Scanner;

//Циклы: задание 3
/*
Пользователь вводит число - х.
Выдаем число из последовательности фибоначчи с
индексом х
*/
public class TakeOutFibonacciNumbers {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа из последовательности фибоначи: ");
        long x = scanner.nextLong();

        if (x < 0){
            System.out.println("Индекс не может быть отрицательным!");
        } else {
            long previous = 0;
            long current = 1;

            for (long i = 2; i <= x; i++) {
                long next = previous + current;
                previous = current;
                current = next;
            }
            System.out.println("число под индексом " + x + ": " + current);
        }
        scanner.close();
    }
}
