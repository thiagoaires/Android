package com.thiagoas.classobjects;

class Cao extends Animal{

    void latir(){
        System.out.println("AU AU");
    }

    void correr(){
        super.correr();
        System.out.println("cao");
    }
}
