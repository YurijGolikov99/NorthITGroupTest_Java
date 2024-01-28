package arrays;

import java.util.HashMap;
import java.util.Map;

//Массивы: задание 5
/*
Дан массив с целыми числами.
Вывести в консоль наиболее часто встречающееся.
Если таких несколько, то вывести наибольшее из них,
если повторяющихся нет, вывести соответствующее сообщение.
 */
public class TheMostOftenFoundedNumbers {
    public static void main(String[]args){
        int[] array = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 8, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && entry.getKey() > mostFrequent)) {
                mostFrequent = entry.getKey();
                maxFrequency = currentFrequency;
            }
        }

        if (maxFrequency > 1) {
            System.out.println("Наиболее часто встречающееся число: " + mostFrequent);
        } else {
            System.out.println("Нет повторяющихся чисел в массиве.");
        }
    }
}
