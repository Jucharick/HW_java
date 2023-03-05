// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
//      1 - ОЗУ
//      2 - Объем ЖД
//      3 - Операционная система
//      4 - Цвет …
// 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


package Lesson_6_finalProject;

import java.util.HashSet;
import java.util.Set;

public class program {
    public static void main(String[] args) {
        Set<Laptop> setLaptop = new HashSet<>();
        setLaptop.add(new Laptop("Windows", 1298, 350, 128, 12, 1150, "grey"));
        setLaptop.add(new Laptop("macOS", 1321, 500, 64, 12, 1050, "black"));
        setLaptop.add(new Laptop("Windows", 1750, 750, 128, 12, 1150, "grey"));
        setLaptop.add(new Laptop("Stratodesk", 1298, 450, 128, 12, 950, "black"));
        setLaptop.add(new Laptop("Windows", 1752, 600, 64, 12, 950, "red"));
        setLaptop.add(new Laptop("macOS", 1298, 350, 32, 12, 750, "yellow"));

        for (Laptop laptop : setLaptop) {
            System.out.println(laptop);
        }
    }
}
