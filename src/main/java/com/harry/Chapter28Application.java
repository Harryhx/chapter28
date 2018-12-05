package com.harry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter28Application {

    public static void main(String[] args) throws Exception {
        //方式一
        PersonEntity p = new PersonEntity();
        Class c1 = p.getClass();
        PersonEntity p2 = new PersonEntity();
        Class c2 = p2.getClass();
        System.out.println(p == p2);
        System.out.println(c1 == c2);
        //第二种方式
        Class c3 = PersonEntity.class;
        System.out.println(c1 == c3);
        //方式3
        Class c4 = Class.forName("com.harry.PersonEntity");
        System.out.println(c1 == c4);
        SpringApplication.run(Chapter28Application.class, args);
    }
}
