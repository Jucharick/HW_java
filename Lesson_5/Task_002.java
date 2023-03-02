// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет 
// и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_002 {

    public static void main(String[] args) {
        ArrayList<String> namesOfEmployee = new ArrayList<>();
        namesOfEmployee.add("Ольга");
        namesOfEmployee.add("Иван");
        namesOfEmployee.add("Николай");
        namesOfEmployee.add("Иван");
        namesOfEmployee.add("Ольга");
        namesOfEmployee.add("Елена");
        namesOfEmployee.add("Юлия");
        namesOfEmployee.add("Александр");
        namesOfEmployee.add("Марина");
        namesOfEmployee.add("Николай");
        namesOfEmployee.add("Иван");
        namesOfEmployee.add("Николай");
        namesOfEmployee.add("Николай");
        namesOfEmployee.add("Николай");
        namesOfEmployee.add("Юлия");
        namesOfEmployee.add("Александр");
        namesOfEmployee.add("Ольга");
        namesOfEmployee.add("Антон");

        System.out.println(namesOfEmployee);

        Map<String, Integer> countName = new HashMap<>();
        int count = 1;
        for (String name : namesOfEmployee) {
            if (!countName.containsKey(name)) {
                countName.put(name, count);
            }
            else {
                int pos = countName.get(name) + 1;
                countName.put(name, pos);
            }
        }
        System.out.println(countName);
    }
}
