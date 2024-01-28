package loops;

import java.util.Scanner;

//Циклы: задание 2
/*
Пользователь вводит число - х.
Выводим в консоль все четные числа от нуля до х
*/
public class TakeOutEvenNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        System.out.println("Четные числа от 0 до " + x + ":");
        for (int i = 0; i <= x; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}
