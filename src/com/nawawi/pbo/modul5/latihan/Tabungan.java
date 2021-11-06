package com.nawawi.pbo.modul5.latihan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah < this.saldo) {
            this.saldo -= jumlah;
            return true;
        }

        return false;
    }

    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }
}
