package task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        Map<String, Integer> mapSalary = new HashMap<>();
        mapSalary.put("Иванов", 1000);
        mapSalary.put("Петров", 2000);
        mapSalary.put("Кузнецов", 3000);
        mapSalary.put("Иванова", 4000);
        mapSalary.put("Петрова", 100);
        mapSalary.put("Кузнецова", 200);
        mapSalary.put("Алексеев", 300);
        mapSalary.put("Володин", 400);
        mapSalary.put("Герасимов", 500);
        mapSalary.put("Титов", 600);

        return (HashMap<String, Integer>) mapSalary;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {


        HashMap<String, Integer> copy = new HashMap(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }

       // for (Map.Entry<String, Integer> pair2: map.entrySet()
     //           ) {
       //     System.out.println(pair2.getKey() + pair2.getValue());
       // }

        //напишите тут ваш код
    }

    public static void main(String[] args) {


    }
}