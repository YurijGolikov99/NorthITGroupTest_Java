package conditional_statements;


import java.util.Scanner;

//Условные операторы: задание 6
/*
Пользователь вводит в консоли три числа.
Рассчитываем и выводим в консоль сумму наибольшего и наименьшего из них
 */
public class SumLargestAndSmallestOfThreeNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        long numberOne = scanner.nextLong();
        long numberTwo = scanner.nextLong();
        long numberThree = scanner.nextLong();

        long minNumber, maxNumber;

        if (numberOne <= numberTwo && numberOne <= numberThree) {
            minNumber = numberOne;
        } else if (numberTwo <= numberOne && numberTwo <= numberThree) {
            minNumber = numberTwo;
        } else {
            minNumber = numberThree;
        }

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            maxNumber = numberOne;
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            maxNumber = numberTwo;
        } else {
            maxNumber = numberThree;
        }

        long sum = minNumber + maxNumber;
        System.out.println("Сумма наименьшего и наибольшего чисел: " + sum);

        scanner.close();
        /* Но через методы Math.max и Math.min будет порядок быстрее
        long biggest = Math.max(Math.max(numberOne, numberTwo), numberThree);
        long smallest =  Math.min(Math.min(numberOne, numberTwo), numberThree);
        long sum = biggest + smallest;
        System.out.println("Сумма наибольшего и наименьшего: " + sum);

        scanner.close();
         */
    }
}
