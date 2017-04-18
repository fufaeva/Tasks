package task19.task1920;

/* 
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] — String, [значение] — double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.
*/

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
       //String name = "C:\\Users\\Юлия\\Documents\\test.txt";
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
      //  BufferedReader reader = new BufferedReader(new FileReader(name));
        while (reader.ready()) {
            String text = reader.readLine().toString();
            String[] list = text.split(" ");
            if (map.containsKey(list[0])) {

                map.put(list[0], Double.parseDouble(list[1]) + map.get(list[0]));

            } else {
                map.put(list[0], Double.parseDouble(list[1]));
            }

        }
        ArrayList<String> listMaxSalary = new ArrayList<>();
        double max = 0;
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue()>=max){
                max = pair.getValue();
            }
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue()==max){
                listMaxSalary.add(pair.getKey());
            }
        }
        for (int i = 0; i <listMaxSalary.size() ; i++) {
            System.out.println(listMaxSalary.get(i));

        }

        reader.close();
    }
}
