package com.thiagoas.classobjects;

class Animal {

    int tamanho;
    String cor;
    double peso;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    void dormir(){
        System.out.println("dormir como ");
    };

    void correr(){
        System.out.println("correr que nem ");
    }
}
