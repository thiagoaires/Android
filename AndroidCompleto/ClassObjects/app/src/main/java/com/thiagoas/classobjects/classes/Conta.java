package com.thiagoas.classobjects.classes;

public class Conta {
    int numeroConta;
    private double saldo = 100;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDoc){
        this.saldo += valorDoc;

        System.out.println(this.getSaldo());
    }

    public void saque(double valorSaque){
        if(valorSaque > this.saldo){
            System.out.println("saldo insuficiente");
        } else{
            this.saldo -= valorSaque;
            System.out.println("saldo " + this.getSaldo());
        }

    }
}
