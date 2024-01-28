package arrays;

//Массивы: задание 8
/*
Дан двумерный массив 5х5 с целыми числами.
Посчитать суммы чисел в каждом столбце и вывести наибольшую из них
 */
public class CountSumInColumn {
    public static void main(String[]args){
        int[][] array = new int[5][5];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = row * array.length + col + 1;
            }
        }

        int maxColumnSum = 0;

        for (int col = 0; col < array[0].length; col++) {
            int columnSum = 0;
            for (int row = 0; row < array.length; row++) {
                columnSum += array[row][col];
            }
            maxColumnSum = Math.max(maxColumnSum, columnSum);
        }

        System.out.println("Наибольшая сумма в столбцах: " + maxColumnSum);
    }
}