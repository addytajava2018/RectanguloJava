package com.company;

public class RectanguloJava {
    int base;
    int altura;

    public RectanguloJava(int altura,int base) {
        this.base=base;
        this.altura=altura;
    }

    public int area(){
        return this.altura*this.base;
    }

    public int perimetro() {
        return (this.base*2)+(this.altura*2);
    }
}
