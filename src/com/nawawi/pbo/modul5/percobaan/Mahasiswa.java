package com.nawawi.pbo.modul5.percobaan;

public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public Mahasiswa(String nama) {
        this(0, nama);
    }

    public Mahasiswa() {
        this(0, "");
    }
}
