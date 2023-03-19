package com.adecco.presentacion;

public class Operadores {
    public static void main(String[] args) {
//        Pre-incremento y post-incremento
        int j = 5 + 5;
        System.out.println("Resultado ->"+j);
        int i=5;
        j= i++;
        System.out.println("Post incremento");
        System.out.println("Valor de i->"+ i);
        System.out.println("Valor de j->"+j);
        i=5;
        j=++i;
        System.out.println("Valor de i->"+ i);
        System.out.println("Valor de j->"+j);
    }
}
