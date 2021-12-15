package com.nawawi.pbo.modul8.latihan;

public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);

        System.out.println("Memanggil mailCheck berdasarkan referensi Gaji --");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck berdasarkan referensi Pegawai --");
        e.mailCheck();
    }
}
