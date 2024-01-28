package arrays;


//Массивы: задание 4
/*
Дан массив с целыми числами.
Вывести в консоль наибольшее из них
 */
public class PrintGreatestNumber {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11};
        int maxNumber = array[0];

        for (int num : array) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        System.out.println("Наибольший элемент в массиве: " + maxNumber);
    }
}
