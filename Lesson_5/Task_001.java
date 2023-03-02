// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_001 {
    public static void main(String[] args) {
        Map<String, List<PhoneWithLabel>> namesToPhoneWithLabel = new HashMap<>();
        
        List<PhoneWithLabel> withLabels1 = new ArrayList<>();
        withLabels1.add(new PhoneWithLabel("mobile", 1324353450));
        withLabels1.add(new PhoneWithLabel("work", 1234567890));
        withLabels1.add(new PhoneWithLabel("mobile", 1098765432));
        withLabels1.add(new PhoneWithLabel("home", 1098765432));

        namesToPhoneWithLabel.put("Ivan Ivanov", withLabels1);

        List<PhoneWithLabel> withLabels2 = new ArrayList<>();
        withLabels2.add(new PhoneWithLabel("mobile", 1324353450));
        withLabels2.add(new PhoneWithLabel("work", 1234567890));

        namesToPhoneWithLabel.put("Petr Petrov", withLabels2);

        List<PhoneWithLabel> withLabels3 = new ArrayList<>();
        withLabels3.add(new PhoneWithLabel("mobile", 1098765432));
        withLabels3.add(new PhoneWithLabel("home", 1098765432));

        namesToPhoneWithLabel.put("Sidr Sidorov", withLabels3);


        System.out.println("Book: ");
        System.out.println(namesToPhoneWithLabel);
        System.out.println("Телефоны Петра: ");
        System.out.println(namesToPhoneWithLabel.get("Petr Petrov"));
    }
}
