package com.curso.java.cursojava;

public class Aula05EstruturasCondicionaisTernarias {

    public static void main(String[] args) {

        double salario = 6000;
        String menssagemDoar = "Eu vou doar 500";
        String menssagemNaoDoar = "Ainda não tenho condições";

        //(condição) ? verdadeiro : falso -> FORMA SIMPLES
        String resultado = salario > 5000 ? menssagemDoar : menssagemNaoDoar;

        //(condição) ? verdadeiro : falso -> MELHOR FORMA
        double salarioFuncionario = 4000;
        String resultadoPergunta = salarioFuncionario > 5000 ? "Eu tenho condições" : "Eu não tenho condições";
    }
}
