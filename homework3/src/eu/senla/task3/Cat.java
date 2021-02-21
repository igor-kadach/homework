package eu.senla.task3;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;

    public Cat() {
        this.name = "Kot";
        this.age = 5;
    }

    public Cat(String nameOfCat, int ageOfCat) {
        this.name = nameOfCat;
        this.age = ageOfCat;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return this.age == cat.age && Objects.equals(this.name, cat.name);
    }


    @Override
    public String toString() {
        return "Name of cat is: " + this.name + " and his age is: " + this.age;
    }
}



