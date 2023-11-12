package p1;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // применить класс Компаратор к нашей коллекции
        //PeopleNameComparator peopleComparator = new PeopleNameComparator();
        // после добавления второго параметра  - возраста меняем:
        Comparator<People> peopleComparator = new PeopleNameComparator().thenComparing(new PeopleAgeComparator()); // т.о. применяется сначала один метод потом второй
        TreeSet<People> peoples = new TreeSet<>(peopleComparator);
        peoples.add(new People("Alex", 32));
        peoples.add(new People("Ivan", 33));
        peoples.add(new People("Ivan", 34));
        System.out.println(peoples); // одинаковый отвалился отсортировался, а после применения Компаратора и по возрасту, стало ясно, что есть различия

    }
}
class PeopleNameComparator implements Comparator<People>{

    @Override
    public int compare(People people, People people2) {
        return people.getName().compareTo(people2.getName()); // метод сравнения
    }
}
// добавим второй компаратор, что бы сравнивать по возрасту
class PeopleAgeComparator implements  Comparator<People>{

    @Override
    public int compare(People people, People people2) {
        if (people.getAge()>people2.getAge())
        return 1;
        else if (people.getAge()<people2.getAge())
        return -1;
        else
            return 0;
    }
}