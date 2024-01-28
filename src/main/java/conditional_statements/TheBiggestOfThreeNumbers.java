package conditional_statements;

import java.util.Scanner;

//Условные операторы: задание 5
/*
Пользователь вводит в консоли три числа, выводим самое большое из них.
 */
public class TheBiggestOfThreeNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        long numberOne = scanner.nextLong();
        long numberTwo = scanner.nextLong();
        long numberThree = scanner.nextLong();

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println("Самое большое число: " + numberOne);
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println("Самое большое число: " + numberTwo);
        } else {
            System.out.println("Самое большое число: " + numberThree);
        }

        scanner.close();
        /* Но если же мы будем делать без условного оператора, а через метод Math.max
        будет на порядок быстрее и проще
        long biggest = Math.max(Math.max(numberOne, numberTwo), numberThree);
            System.out.println("Самое большое число: " + biggest);
         */
    }
}
