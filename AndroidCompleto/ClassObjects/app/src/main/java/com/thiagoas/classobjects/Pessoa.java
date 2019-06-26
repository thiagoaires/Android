package com.thiagoas.classobjects;

public class Pessoa {
    private String pessoa;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("exibir apenas nome " + nome);
    }

    public void exibirDados(String nome, int idade){
        System.out.println("nome" + nome + "idade" + idade);
    }
}
