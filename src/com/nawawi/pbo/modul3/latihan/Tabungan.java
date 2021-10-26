package com.nawawi.pbo.modul3.latihan;

public class Tabungan {
    private int saldo;

    Tabungan(int saldo) {

    }

    public int getSaldo() {
        return this.saldo;
    }

    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah < this.saldo) {
            this.saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
