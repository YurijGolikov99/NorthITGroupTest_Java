package arrays;

//Массивы: задание 2
/*
Дан массив с целыми числами.
Вывести в консоль сумму элементов с четными индексами
 */
public class SumOfNumbersWithEvenIndex {
    public static void main(String[]args){
        int[] array = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11};
        int sum = 0;

        for (int i = 0; i < array.length; i += 2){
            sum += array[i];
        }

        System.out.println("Сумма элементов с четными индексами = " + sum);
    }
}
