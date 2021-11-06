package com.nawawi.pbo.modul5.percobaan;

public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama) {
        this.kodeKelas = kode;
        this.namaKelas = nama;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
