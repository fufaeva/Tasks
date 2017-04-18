package task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами проживает больше жителей.»

Примечание:
дом с порядковым номером 0 считать четным.


Требования:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] massiv = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = Integer.parseInt(reader.readLine());
        }
       /* for (int i = 0; i < massiv.length; i++) { // проверка длинны массива
            System.out.println(i);
        } */

        int chet = 0;
        int nechet = 0;


        for (int i = 0; i < massiv.length; i = i + 2) {
            chet = chet + massiv[i];
        }
        for (int i = 1; i < massiv.length; i = i + 2) {
            nechet = nechet + massiv[i];
        }

        if (chet > nechet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


        //напишите тут ваш код
    }
}