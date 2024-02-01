package conditional_statements;

import java.util.Scanner;

//Условные операторы: задание 8
/*
Программа “Магазин”, выводим меню из трех товаров с ценами.
Пользователь выбирает товар, вводит сумму денег.
Если сумма меньше цены, выводим сообщение: “Денег не хватает!”,
если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача: [сумма сдачи]”
 */
public class ShopProgram {
    public static void main (String[] args){
        String[] products = {"Товар 1", "Товар 2", "Товар 3"};
        double[] prices = {10.0, 20.0, 30.0};

        for (int x = 0; x < products.length; x++) {
            System.out.println(products[x] + " = " + prices[x] + " " + "руб.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите товар (введите номер): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > products.length) {
            System.out.println("Такого товара нет!");
            return;
        } else {
            double price = prices[choice - 1];
            System.out.print("Введите сумму денег: ");
            double sum = scanner.nextDouble();

            if (sum < price) {
                System.out.println("Денег не хватает!");
            } else if (sum == price) {
                System.out.println("Спасибо за покупку!");
            } else {
                double change = sum - price;
                System.out.println("Ваша сдача: " + change + " руб.");
            }
        }
        scanner.close();
    }
}
