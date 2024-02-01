package conditional_statements;

import java.util.Scanner;

//Условные операторы: задание 7
/*
Пользователь вводит в консоли число.
Выводим сообщение о том, четное число, или нечетное
 */
public class EvenOrOddNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        long number = scanner.nextLong();

        if (number % 2 == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }
    }
}
