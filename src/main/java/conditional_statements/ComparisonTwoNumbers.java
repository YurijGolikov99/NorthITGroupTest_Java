package conditional_statements;

import java.util.Scanner;

//Условные операторы: задание 2
/*
 Пользователь вводит в консоли два числа,
 выводим сообщение “первое число больше/меньше,
 чем второе” в зависимости от результата их сравнения
 */
public class ComparisonTwoNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        long numberOne = scanner.nextLong();
        long numberTwo = scanner.nextLong();
        if (numberOne > numberTwo) {
            System.out.println("Первое число больше второго");
        } else if (numberOne < numberTwo) {
            System.out.println("Первое число меньше второго");
        } else {
            // TODO:
            //  в требование к заданию не упомянулось, что делать в ситуации если числа равны
            System.out.println("Числа равны");
        }
        scanner.close();
    }
}
