package task19.task1926;

/* 
Перевертыши
1 Считать с консоли имя файла. Считать содержимое файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке.
2.2 вывести на экран.
3 Закрыть потоки.

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все символы из файла в обратном порядке.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(name));

        while (fileReader.ready()) {

           String s = fileReader.readLine();
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();

            System.out.println(stringBuilder.toString());

        }


        reader.close();
        fileReader.close();
    }

}