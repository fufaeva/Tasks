package task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine(); // вносим в список наши строки
            array.add(s);
        }
        int max = array.get(0).length();
        int min = array.get(0).length();


        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() > max) {
                max = array.get(i).length();
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() < min) {
                min = array.get(i).length();
            }
        }

        for (int i = 0; i <array.size() ; i++) {
            if (array.get(i).length() == max ||array.get(i).length() == min  ){
                System.out.println(array.get(i));
                break;
            }

        }

        //напишите тут ваш код
    }
}
