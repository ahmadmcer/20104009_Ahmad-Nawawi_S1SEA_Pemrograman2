package com.nawawi.pbo.modul6.latihan;

public class InheritanceTest {
    public static void main(String[] args) {
        A ortu = new A();
        B anak = new B();

        System.out.println("superclass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        System.out.println("subclass");
        anak.setX(5);
        anak.setY(4);
        anak.getNilai();
        anak.setZ(50);
        anak.getJumlah();
    }
}
