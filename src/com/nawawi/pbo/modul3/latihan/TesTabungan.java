package com.nawawi.pbo.modul3.latihan;

public class TesTabungan {
    public static void main(String[] args) {
        boolean status;

        Tabungan tabungan = new Tabungan(10000);
        System.out.println("Saldo awal: " + tabungan.getSaldo());

        tabungan.simpanUang(8000);
        System.out.println("Jumlah uang yang disimpan: 8000");

        status = tabungan.ambilUang(7000);
        System.out.print("Jumlah uang yang diambil: 7000");
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" GAGAL");
        }

        tabungan.simpanUang(1000);
        System.out.println("Jumlah uang yang disimpan: 1000");

        status = tabungan.ambilUang(10000);
        System.out.print("Jumlah uang yang diambil: 10000");
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" GAGAL");
        }

        status = tabungan.ambilUang(2500);
        System.out.print("Jumlah uang yang diambil: 2500");
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" GAGAL");
        }

        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan: 2000");

        System.out.println("Saldo sekarang: " + tabungan.getSaldo());
    }
}
