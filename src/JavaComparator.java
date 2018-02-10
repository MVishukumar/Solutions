import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {
    public static void main(String[] args) {
        System.out.println("Hi");

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Shaggy", 3));
        dogs.add(new Dog("Lacy", 2));
        dogs.add(new Dog("Roger", 10));
        dogs.add(new Dog("Tommy", 4));
        dogs.add(new Dog("Tammy", 1));
        dogs.add(new Dog("Tammy", 2));

        Collections.sort(dogs);

        System.out.println("After sorting by name");
        for(Dog d: dogs) {
            System.out.println(d);
        }

        System.out.println("After sorting by age");
        Collections.sort(dogs, new Dog());

        for(Dog d: dogs) {
            System.out.println(d);
        }
    }
}

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;

    Dog() {}

    Dog(String s, int i) {
        this.name = s;
        this.age = i;
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


    @Override
    public int compareTo(Dog o) {
        return (this.name).compareTo(o.getName());
    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return o2.getAge() - o1.getAge();
    }

    @Override
    public String toString() {
        return this.getName() + " : " + this.getAge();
    }
}
