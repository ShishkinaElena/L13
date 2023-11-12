package p2;

import p1.People;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Alex");    // метод put
        names.put(2, "Ivan");
        names.put(3, "Nick");
        names.put(4, "Masha");
        String val1 = names.get(2); // получить объект по ключу
        System.out.println(val1);

        Set<Integer> set = names.keySet();
        Collection<String> collection = names.values();
        System.out.println(set); //[1, 2, 3, 4]
        System.out.println(collection); // [Alex, Ivan, Nick, Masha]
        names.replace(1, "Katya");  // метод replace
        names.remove(3);
// перебрать все элементы:
        for (Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.printf("Key %d Value %s \n", entry.getKey(), entry.getValue());
            /* Key 1 Value Katya
            Key 2 Value Ivan
            Key 4 Value Masha*/

        }
        // используем из перврго объекта People
        Map<String, People> peopleMap = new HashMap<>();
        // теперь в peopleMap добавляем элементы
        peopleMap.put("ghhjkll;87",  new People("Alex", 32));
        peopleMap.put("sdfg34", new People("Masha", 33));
        peopleMap.put("dfvsgv", new People("Misha", 19));

        for(Map.Entry<String, People> entry: peopleMap.entrySet()){
            System.out.printf("Key: %s Value: %s \n", entry.getKey(), entry.getValue().toString());
        }

    }
}
