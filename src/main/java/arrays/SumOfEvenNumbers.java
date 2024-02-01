package arrays;

//Массивы: задание 3
/*
Дан массив с целыми числами.
Вывести в консоль сумму четных элементов (четные значения)
 */
public class SumOfEvenNumbers {
    public static void main(String[]args){
        int[] array = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11};
        int sum = 0;

        for (int num : array){
            if (num %2 == 0) {
                sum += num;
            }
        }

        System.out.println("Сумма чётных элементов = " + sum);
    }
}
