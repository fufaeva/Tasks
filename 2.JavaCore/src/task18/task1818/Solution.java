package task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName2);
        FileInputStream fileInputStream1 = new FileInputStream(fileName3);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        while (fileInputStream.available()>0){
            fileOutputStream.write(fileInputStream.read());
        }
        fileInputStream.close();

        while (fileInputStream1.available()>0){
            fileOutputStream.write(fileInputStream1.read());
        }
        fileInputStream1.close();
        fileOutputStream.close();
    }
}
