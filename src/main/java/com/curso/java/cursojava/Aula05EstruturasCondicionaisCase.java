package com.curso.java.cursojava;

public class Aula05EstruturasCondicionaisCase {

    public static void main(String[] args) {

        byte dia = 3;

        switch (dia) {
            default:
                System.out.println("Opção inválida");
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
        }
    }
}
