package com.curso.java.cursojava;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        char caractereAscii = 65; //tabela ascii
        char caractereUnicode = '\u0041'; //tabela unicode
        String nome = "Pode colocar o nome completo aqui"; //String não é um tipo primitivo, é uma classe


        //Na prática não é utilizado System.out.println, mas sim log.info
        System.out.println("A idade é " + idade + " anos");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(verdadeiro);
        System.out.println(caractereAscii);
        System.out.println(caractereUnicode);
        System.out.println(nome);

    }
}
