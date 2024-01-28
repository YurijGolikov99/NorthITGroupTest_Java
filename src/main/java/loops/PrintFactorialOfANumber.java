package loops;

import java.util.Scanner;

//Циклы: задание 4
/*
Пользователь вводит число. Выводим в консоль факториал этого числа
*/
public class PrintFactorialOfANumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        long x = scanner.nextLong();

        if (x < 0) {
            System.out.println("Факториал не может быть отрицательным!");
        } else {
            long fact = 1;

            for (long i = 1; i <= x; i++){
                fact = fact * i;
            }
            System.out.println("Факториал числа " + x + " = " + fact);
        }
        scanner.close();
    }
}
