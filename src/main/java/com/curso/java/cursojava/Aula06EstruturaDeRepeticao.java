package com.curso.java.cursojava;

import org.springframework.aop.scope.ScopedObject;

public class Aula06EstruturaDeRepeticao {

    public static void main(String[] args) {

        int count = 0;

        while (count < 2) {
            System.out.println(++count);
        }

        count = 0;

        do {
            System.out.println("Dentro do while " + ++count);
        } while (count < 2);

        for (int i = 0; i < 2 ; i++) {
            System.out.println("For inicial " + i);
        }

        for (count = 0; count < 2 ; count++) {
            System.out.println("For final " + count);
        }
    }
}
