package com.adecco.presentacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Variables primitivas en java--");
        System.out.println("--Variable numericas enteras");
        byte vByte = 3;
        short vShort =1234;
        int vInt =123_123;
        long vLong=123_123_123L;
        System.out.println("--Variables numéricas decimales (punto flotante)");
        float vFloat =3.5f;
        double vDouble = 3.555;
        System.out.println("Float ->"+vFloat);
        System.out.println("Decimal ->"+vDouble);
        System.out.println("--Variables char y boolean");
        char vChar = 'a';
        boolean vBoolean = 5>10;
        System.out.println("Variable char"+ vChar);
        System.out.println("Variable boolean"+ vBoolean);


    }
}