package Day27;

import java.util.Set;
import java.util.TreeSet;

class Person1 implements Comparable<Person1>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person1 o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age < o.age){
            return -1;
        }else {
            return this.name.compareTo(o.name);
        }
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
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


public class TestTreeSet {
    public static void main(String[] args) {

        Set<Person1> set = new TreeSet<>();
        set.add(new Person1("zhangsan",21) );
        set.add(new Person1("lulu",22));
        set.add(new Person1("zhangsan",21));
        set.add(new Person1("luli",24));
        System.out.println(set);
    }
}

//如果属性多，这个方法过于麻烦，所以一般使用HashSet。