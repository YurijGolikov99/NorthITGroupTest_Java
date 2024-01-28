package conditional_statements;

import java.util.Scanner;


//Условные операторы: задание 1
/*
Пользователь вводит в консоли число. Если оно больше 10,
выдаем в консоли сообщение “Число больше десяти”, если меньше – “Число меньше десяти”
 */
public class SmallerThanTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        long number = scanner.nextLong();
        if (number > 10) {
            System.out.println("Число больше десяти");
        } else if (number < 10)  {
            System.out.println("Число меньше десяти");
        } else {
            // TODO:
            //  в требование к заданию не упомянулось, что делать в ситуации с числом = 10
            //  так же можно сделать прекращение выполнения программы через System.exit(0);
            System.out.println("Число равно десяти");
        }
        scanner.close();
    }
}
