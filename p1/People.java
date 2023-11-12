package p1;

import java.util.Objects;

public class People {
    private  String name;
    private int age;


   /* public People(String name) {
        this.name = name;
    }*/
   public People(String name, int age) { //Добавляем в конструктор второй параметр - возраст
       this.name = name;
       this.age = age;
   }

   //  надо добавить геттор

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    /*  @Override
    public boolean equals(Object o) {   // в equals и  hashCode() тоже надо добавить второй параметр и
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /* @Override
     public int compareTo(People o) {     // данный метод позволяет сравнить текущий объект с объектом(p),
                                                     который был передан в качестве параметра
         return 0;
     }*/
  /*  @Override
    public int compareTo(People p) {
        // return name.compareTo(p.getName()); // таким методом можно сравнить объекты, метод возвращает отр число, то объект тек будет располагаться перед тем, который дан по параметрам
        // можно сравнить по длине имени:
        return name.length() - p.getName().length();

    }*/

    /*@Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }*/

    // надо перегенерировать toString() , т.к. мы добавили второй параметр

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
