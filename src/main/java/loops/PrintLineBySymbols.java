package loops;

import java.util.Scanner;

//Циклы: задание 5
/*
Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
один символ)
*/
public class PrintLineBySymbols {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String x = scanner.nextLine();

        char[] charArray = x.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
        scanner.close();
    }
}
