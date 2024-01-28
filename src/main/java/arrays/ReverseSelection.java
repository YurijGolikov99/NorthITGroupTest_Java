package arrays;

//Массивы: задание 7
/*
Дан двумерный массив 10х10 с целыми числами.
Вывести в консоль все числа по диагонали от [0][10] до [10][0]
 */
public class ReverseSelection {
    public static void main(String[]args){
        int[][] array = new int[10][10];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = row * array.length + col + 1;
            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row + col == array.length - 1) {
                    System.out.print(array[row][col] + " ");
                }
            }
        }
    }
}
