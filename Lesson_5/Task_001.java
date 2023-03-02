// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_001 {
    public static void main(String[] args) {
        Map<String, List<PhoneWithLabel>> namesToPhoneWithLabel = new HashMap<>();
        
        List<PhoneWithLabel> ivansPhone = new ArrayList<>();
        ivansPhone.add(new PhoneWithLabel("mobile", 1324353450));
        ivansPhone.add(new PhoneWithLabel("work", 1234567890));
        ivansPhone.add(new PhoneWithLabel("mobile", 1098765432));
        ivansPhone.add(new PhoneWithLabel("home", 1098765432));

        namesToPhoneWithLabel.put("Ivan Ivanov", ivansPhone);

        List<PhoneWithLabel> petersPhone = new ArrayList<>();
        petersPhone.add(new PhoneWithLabel("mobile", 1324353450));
        petersPhone.add(new PhoneWithLabel("work", 1234567890));

        namesToPhoneWithLabel.put("Petr Petrov", petersPhone);

        List<PhoneWithLabel> sidorsPhone = new ArrayList<>();
        sidorsPhone.add(new PhoneWithLabel("mobile", 1098765432));
        sidorsPhone.add(new PhoneWithLabel("home", 1098765432));

        namesToPhoneWithLabel.put("Sidr Sidorov", sidorsPhone);


        System.out.println("Book: ");
        System.out.println(namesToPhoneWithLabel);
        System.out.println("Телефоны Петра: ");
        System.out.println(namesToPhoneWithLabel.get("Petr Petrov"));
    }
}
