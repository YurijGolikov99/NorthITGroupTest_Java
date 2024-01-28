package loops;

//Циклы: задание 1
/*
Вывести в консоль таблицу умножения на 4
 */
public class MultiplicationTable {
    public static void main(String[]args){
        System.out.println("Таблица умножения на 4:");
        int x = 4;

        /* В некоторых тетрадках в клетку с обратной стороны в таблице умножения был включен и 0,
        лично моё мнение, это не нужно в данном контексте задачи.
        Если же нужно, то первичное значение меняем с 1 на 0
         */
        for (int i = 1; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}
