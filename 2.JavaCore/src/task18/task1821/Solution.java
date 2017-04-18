package task18.task1821;

/* 
Встречаемость символов
Программа запускается с одним параметром — именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
‘,’=44, ‘s’=115, ‘t’=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fr = new FileReader(new File(fileName));
        TreeMap<Character, Integer> map = new TreeMap();

        int ch;
        while ((ch = fr.read()) != -1) {
            if(map.containsKey((char)ch)) {
                map.put((char)ch, map.get((char)ch) + 1);
            }
            else {
                map.put((char)ch, 1);
            }
        }
        for(Map.Entry pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        fr.close();
    }
}
