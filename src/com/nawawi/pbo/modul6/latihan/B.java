package com.nawawi.pbo.modul6.latihan;

public class B extends A {
    private int z;

    public void getJumlah() {
        System.out.println("Jumlah: " + (x + y + z));
    }

    public void setZ(int z) {
        this.z = z;
    }
}
