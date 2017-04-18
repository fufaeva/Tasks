package task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}

Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"


Требования:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/
public class Solution {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // map.put("name", "Vasiya");
        //map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder where = new StringBuilder();


        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {

                where.append(pair.getKey());
                where.append(" = '");
                where.append(pair.getValue());
                where.append("' and ");
            }


        }
        if (params !=null && where.toString().isEmpty()){
            return "";
        }
        return where.substring(0, where.lastIndexOf(" and "));


    }
}
