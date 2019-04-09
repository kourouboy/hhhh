package Day27;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 重复元素的判断 -- hash
 */

class Person3 implements Comparable<Person3>{

    private String  name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person3 = (Person3) o;
        return Objects.equals(name, person3.name) &&
                Objects.equals(age, person3.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person3(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person3 o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age < o.age){
            return -1;
        }else{
            return this.name.compareTo(o.name);
        }
    }

}
public class Day27_1 {

    public static void main(String[] args) {
        Set<Person3> set = new HashSet<>();
        set.add(new Person3("zhangsan",21));
        set.add(new Person3("zhuzhu",18));
        set.add(new Person3("zhangsan",21));
        set.add(new Person3("wangwu",11));
        System.out.println(set);
    }
}
