package Day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class TestArrayList1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("zhangsan",21));
        personList.add(new Person("lisi",22));
        personList.add(new Person("lulu",32));
        //集合中contains()、remove()方法需要equals()支持
        personList.remove(new Person("lisi",22));
        System.out.println(personList.contains(new Person("zhangsan",21)));
        for(Person person : personList){
            System.out.println(person);
        }

    }
}
