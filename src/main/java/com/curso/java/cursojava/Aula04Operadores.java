package com.curso.java.cursojava;

public class Aula04Operadores {

    public static void main(String[] args) {

        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero2 / numero1;
        double resultado1 = numero1 / numero2;
        double resultado2 = numero1 / (double) numero2;

        // %
        int resto = 21 % 7;

        // < > <= => == =!
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        // && (e) || (ou) ! (diferente)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        double valorConta = 200;
        double valorPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorConta > valorPlaystation || valorPoupanca > valorPlaystation;

        // = += -= *= /= %=
        double bonus = 1800;
        bonus = 1800 + 1000;

        //Primeira forma
        bonus = bonus + 1000;
        bonus = bonus - 1000;
        bonus = bonus * 1000;
        bonus = bonus / 1000;
        bonus = bonus % 1000;

        //Segunda forma
        bonus += 1000;
        bonus -= 1000;
        bonus *= 1000;
        bonus /= 1000;
        bonus %= 1000;

        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        contador--;

        int contador1 = 0;
        System.out.println(contador1++);
        System.out.println(contador1++);
        System.out.println(++contador1);
        System.out.println(++contador1);

        System.out.println(contador);
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resto);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDeVinte);
        System.out.println(isDentroDaLei);
        System.out.println(isPlaystationCompravel);
        System.out.println(bonus);
    }
}
