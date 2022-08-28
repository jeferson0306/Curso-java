package com.curso.java.cursojava;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {

        int idade = 15;
        boolean isMaiorDeIdade = idade >= 18;

        //Opção regular
        if (isMaiorDeIdade) {
            System.out.println("A idade é = " + idade + ". Está autorizado!");
        }
        System.out.println("A idade é = " + idade + ". Não está autorizado!");

        //Melhor opção
        if (!isMaiorDeIdade) {
            System.out.println("A idade é = " + idade + ". Não está autorizado!");
        }
    }
}
