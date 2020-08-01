package com.kwy.springboot01.test;

/**
 * @Author: 孔维一
 * @Data: 2020/8/1 19:11
 * @Version: 1.0.0
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setName("孔维一");
        //设置体重
        person.setWeight(55);
        for ( int i = 0 ; i < person.toString().length() ; i ++){
            System.out.print(person.toString().charAt(i));
        }
    }
}
