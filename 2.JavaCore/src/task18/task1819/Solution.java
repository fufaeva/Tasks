package task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения и считай его содержимое.
3. Затем, для первого файла создай поток для записи. Для второго - для чтения.
4. Содержимое первого и второго файла нужно объединить в первом файле.
5. Сначала должно идти содержимое второго файла, затем содержимое первого.
6. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(name2);
        FileInputStream fileInputStream1 = new FileInputStream(name1); // Для временной записи файлов з первого файла

        ArrayList<byte[]> list = new ArrayList<>();




        while (fileInputStream.available() > 0) {

            byte[] buffer1 = new byte[fileInputStream.available()];
            fileInputStream.read(buffer1);
            list.add(buffer1);

        }
       fileInputStream.close();

        while (fileInputStream1.available() > 0) {

            byte[] buffer = new byte[fileInputStream1.available()];
            fileInputStream1.read(buffer);
            list.add(buffer);

        }

        fileInputStream1.close();

        FileOutputStream fileOutputStream = new FileOutputStream(name1);

        for (int i = 0; i <list.size() ; i++) {
            fileOutputStream.write(list.get(i));
        }

        fileOutputStream.close();

    }
}
