package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String base;
        String altura;
        String opcion;
        int op;
        int ba;
        int al;

        do {
            System.out.println("Ingrese base de rectangulo:");
            ba=Integer.parseInt(base=sc.nextLine());
            System.out.println("Ingrese altura del rectangulo:");
            al=Integer.parseInt(altura=sc.nextLine());
            RectanguloJava r=new RectanguloJava(ba,al);
            System.out.println("Opcion 1 para AREA ; Opcion 2 para PERIMETRO ; Opcion 0 TERMINAR");

            op=Integer.parseInt(opcion=sc.nextLine());
            switch(op){
                case 1:
                    System.out.println("El area del rectangulo es:"+r.area());break;
                case 2:
                    System.out.println("El perimetro del rectangulo es:"+r.perimetro());break;
                default:break;
            }
            if(op==0)break;

        } while (true);

    }


}
