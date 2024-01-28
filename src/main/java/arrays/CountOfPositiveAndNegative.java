package arrays;

//Массивы: задание 1
/*
Дан массив с целыми числами.
Вывести в консоль количество положительных и отрицательных чисел в нем
 */
public class CountOfPositiveAndNegative {
    public static void main(String[]args){
        int[] array = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11};

        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : array){
            if (num > 0){
                positiveCount++;
            } else if (num < 0){
                negativeCount++;
            } else {
                System.out.println("нейтральное число нельзя отнести к положительным или отрицательным");
            }
        }

        System.out.println("количество положительных чисел: " + positiveCount +
                "\nколичество отрицательных чисел: " + negativeCount);
    }
}
