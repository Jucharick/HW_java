// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.


package Lesson_2;

public class Task_001 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}"; // обратный слеш \ - нужен для " "
        input = input.substring(1, input.length() - 1);
        System.out.println(input);

        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM students WHERE ");

        String[] parts = input.split (", "); // разделяем по запятой с пробелом
        boolean isFirst = true;
        for (String part : parts) {
            String[] keyValue = part.split (":"); // создаем массив из части (parts), разделенной по :
            String key = keyValue[0];
            key = key.substring (1, key.length() - 1); // обрезаем у ключа кавычки
            String value = keyValue[1];

            if (value.equals ("\"null\"")) { // пропускаем "age":"null"
                continue;
            }
            if (!isFirst){
                builder.append(" AND ");
            }
            builder.append (String.format ("%s = %s", key, value));
            isFirst = false;
        }
        builder.append(";");
        System.out.println(builder.toString());
    }
}
