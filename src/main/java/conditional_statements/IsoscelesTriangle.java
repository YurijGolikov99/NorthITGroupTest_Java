package conditional_statements;

import java.util.Scanner;

//Условные операторы: задание 3
/*
Пользователь вводит в консоли длины сторон треугольника (три числа),
выводим сообщение, является ли треугольник равнобедренным,
равносторонним или разносторонним.
 */
public class IsoscelesTriangle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == b && b == c){
            System.out.println("треугольник является равносторонним");
        } else if  (a == b || b == c || a == c){
            System.out.println("треугольник является равнобедренным");
        } else {
            System.out.println("треугольник является разносторонним");
        }

        scanner.close();
    }
}
