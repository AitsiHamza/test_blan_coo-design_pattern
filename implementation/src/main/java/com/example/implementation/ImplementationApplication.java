package com.example.implementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImplementationApplication {

    public static void main(String[] args) {
        Group mainGroup = new Group();
        Group group1 = new Group();
        Group group2 = new Group();

        mainGroup.add(group1);
        mainGroup.add(group2);
        mainGroup.add(new Cercle(2,new Point(4.0,5.0)));

        group1.add(new Cercle(5,new Point(10.0,0.0)));
        group1.add(new Rectangle(5,10,new Point(10.0,0.0)));

        group2.add(new Rectangle(1,30,new Point(8.0,9.0)));

        mainGroup.dessiner();
    }

}
