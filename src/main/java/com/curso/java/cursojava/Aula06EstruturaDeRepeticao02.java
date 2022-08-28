package com.curso.java.cursojava;

public class Aula06EstruturaDeRepeticao02 {

    public static void main(String[] args) {

        //Imprimir todos os números pares de 0 a 100
        int numeroPar = 0;

        //Forma correta - se o negocial mudar -> errado
        for (numeroPar = 0; numeroPar <= 100 ; numeroPar += 2)
            System.out.println(numeroPar);

        //Forma correta - se o negocial mudar -> correto
        for (numeroPar = 0; numeroPar <= 100 ; numeroPar++)
            if (numeroPar % 2 == 0) {
            System.out.println(numeroPar);
            }
    }
}
