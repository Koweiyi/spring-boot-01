package com.kwy.springboot01.test;

import java.util.Objects;

/**
 * @Author: 孔维一
 * @Data: 2020/8/2 1:34
 * @Version: 1.0.0
 */
public class Test {
    private String  name;
    private int age;
    private String myName;

    public Test(String name) {
        this.name= name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Test test = (Test) o;
        return age == test.age &&
                Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Test{" +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
