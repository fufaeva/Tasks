package task2202;

/* 
Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
«JavaRush — лучший сервис обучения Java.»

Результат:
«— лучший сервис обучения»

На некорректные данные бросить исключение TooShortStringException (сделать исключением).


Требования:
1. Класс TooShortStringException должен быть потомком класса RuntimeException.
2. Метод getPartOfString должен принимать строку в качестве параметра.
3. В случае, если строка, переданная в метод getPartOfString содержит менее 4 пробелов должно возникнуть исключение TooShortStringException.
4. Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова, которое следует после 4-го пробела.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));

    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] parts = string.split(" ");
        int count = 0;
        int lastPartIndex = 5;
        String res = "";
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        if (count < 4) {
            throw new TooShortStringException();
        }
        if (parts.length<5) lastPartIndex = parts.length;


        for (int i = 1; i < lastPartIndex; i++) {
            if (res.isEmpty()) {res = parts[i];}
            else res = res + " " + parts[i];
        }

        return res;



    }

    public static class TooShortStringException extends RuntimeException {
    }
}
