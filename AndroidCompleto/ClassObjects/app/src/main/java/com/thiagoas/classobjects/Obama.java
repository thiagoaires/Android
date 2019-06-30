package com.thiagoas.classobjects;

public class Obama extends Cidadao implements Presidente{

    @Override
    public void ganharEleicao() {
        System.out.println("Vencer eleicao nos EUA");
    }
}
