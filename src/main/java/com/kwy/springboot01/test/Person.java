package com.kwy.springboot01.test;

import org.w3c.dom.css.CSSPrimitiveValue;

/**
 * @Author: 孔维一
 * @Data: 2020/8/1 19:01
 * @Version: 1.0.0
 */

public class Person {
    private int age;
    private String name;
    private float weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}



