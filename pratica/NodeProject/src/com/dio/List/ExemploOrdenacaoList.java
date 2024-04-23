package com.dio.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ExemploOrdenacaoList {
    public static void main(String[] args) {
//        Cat catto = new Cat("Pretinho", "preto", 5);
//        System.out.println(catto.getName());

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Jon", "preto", 18 ));
            add(new Cat("Simba", "amarelo", 6 ));
            add(new Cat("Leia", "tigrado", 8 ));
        }};

//        printar em ordem aleatoria
//        Collections.shuffle(myCats);
//        Collections.sort(myCats);
        myCats.sort(new ComparatorAge());
        System.out.println(myCats);
    }
}

class Cat implements Comparable<Cat> {
    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name, color;
    private Integer age;

    @Override
    public String toString() {
        return "{nome: " + name +
                ", idade: " + age +
                ", color: " + color + "}";
    }

    @Override
    public int compareTo(Cat o) {
        return (this.getName().compareToIgnoreCase(o.getName()));

//        this.getAge() > o.getAge();
    }
}

class ComparatorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}