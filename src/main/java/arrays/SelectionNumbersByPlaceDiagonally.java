package arrays;

//Массивы: задание 6
/*
Дан двумерный массив 10х10 с целыми числами.
Вывести в консоль все числа по диагонали от [0][0] до [10][10]
 */
public class SelectionNumbersByPlaceDiagonally {
    public static void main(String[]args){
        int[][] array = new int[10][10];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = row * array.length + col + 1;
            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == col) {
                    System.out.print(array[row][col] + " ");
                }
            }
        }
    }
}