# Modul 5: Mengelola Class

## Dasar Teori
- **Package**
  
  *Package* adalah suatu cara untu mengelola (*managing*) *class*-*class* yang kita buat. *Package* akan sangat bermanfaat jika *class*-*class* yang kita buat sangat banyak sehingga perlu dikelompokkan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama *class* utama harus sama dengan nama *package*.
  
  **Sintaks:**  
  ```java
  package <namapackage>;
  ```
  
  **Contoh:**  
  ```java
  package utama;
  ```
  
  ---

- **Import Class**
  
  Perintah *import* digunakan untuk memberitahukan kepada program untuk mengacu pada *class*-*class* yang terdapat dalam *package* tertentu, guna menjalankan *class*-*class* tersebut.
  
  **Sintaks:**  
  ```java
  import <nama_package>.*;
  ```
  
  **Contoh:**  
  ```java
  import matematik.*;
  ```
  
  Sedangkan untuk mengimpor *class* tertentu dapat dituliskan nama *class* setelah nama *package*.
  
  **Sintaks:**  
  ```java
  import <nama_package>.<nama_class>;
  ```
  
  **Contoh:**  
  ```java
  import matematik.Bilangan;
  ```
  
  **Contoh 2:**  
  ```java
  package utama;
  
  import matematik.Bilangan;
  
  class Utama {
    public static void main(String[] args) {
      Bilangan x = new Bilangan();
      
      x.setDesimal(-44);
      System.out.println("Bilangan biner dari " + x.getDesimal() + " adalah " + x.biner());
    }
  }
  ```
  
  ---

- **Kata Kunci *this***
  
  Kata kunci ini digunakan dalam sebuah *class* untuk menyatakan *object* sekarang. Kata kunci *this* sangat berguna untuk menunjukkan suatu member dalam *class*-nya sendiri. *this* dapat digunakan baik untuk *data member* maupun untuk *function member*, serta dapat juga digunakan untuk *constructor*. Adapun sintaks penulisannya adalah:
  
  | Sintaks                | Keterangan                   |
  |------------------------|------------------------------|
  | this.data_member       | Merujuk pada data member     |
  | this.function_member() | Merujuk pada function member |
  | this()                 | Merujuk pada constructor     |
  
  ---

## Praktikum
**Soal:**  
Mengimplementasikan *UML Class Diagram* dalam program untuk *package perbankan*.

![UML Class](https://lh4.googleusercontent.com/LZ3UIfXdoBHSSAdRPPSqHdYB1glvNnBWgEvnZQSarLRNi0IpNo2lQhcCgp2Dh5paZ-INVoyaWrCG1ZbkWK-q=w1366-h657)

**Jawaban:**  
[Tabungan](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul5/src/com/nawawi/pbo/modul5/latihan/Tabungan.java)  
[Nasabah](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul5/src/com/nawawi/pbo/modul5/latihan/Nasabah.java)  
[TesLatihan](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul5/src/com/nawawi/pbo/modul5/latihan/TesLatihan.java)

```java
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
```

```java
package com.nawawi.pbo.modul5.latihan;

public class Nasabah {
  private String namaAwal;
  private String namaAkhir;
  private Tabungan tabungan;

  public Nasabah(String namaAwal, String namaAkhir) {
    this.namaAwal = namaAwal;
    this.namaAkhir = namaAkhir;
  }

  public String getNamaAwal() {
    return this.namaAwal;
  }

  public String getNamaAkhir() {
    return this.namaAkhir;
  }

  public Tabungan getTabungan() {
    return this.tabungan;
  }

  public void setTabungan(Tabungan tabungan) {
    this.tabungan = tabungan;
  }
}
```

Lalu kita tes dengan kode program di bawah ini:

```java
package com.nawawi.pbo.modul5.latihan;

public class TesLatihan {
  public static void main(String[] args) {
    int temp;
    boolean status;

    Nasabah nasabah = new Nasabah("Agus", "Daryanto");
    System.out.println("Nasabah atas nama: " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());

    nasabah.setTabungan(new Tabungan(5000));
    temp = nasabah.getTabungan().getSaldo();
    System.out.println("Saldo awal: " + temp);

    nasabah.getTabungan().simpanUang(3000);
    System.out.println("Jumlah uang yang disimpan: 3000");

    status = nasabah.getTabungan().ambilUang(6000);
    System.out.print("Jumlah uang yang diambil: 6000");
    if (status) System.out.println(" OK");
    else System.out.println(" GAGAL");

    nasabah.getTabungan().simpanUang(3500);
    System.out.println("Jumlah uang yang disimpan: 3500");

    status = nasabah.getTabungan().ambilUang(4000);
    System.out.print("Jumlah uang yang diambil: 4000");
    if (status) System.out.println(" OK");
    else System.out.println(" GAGAL");

    status = nasabah.getTabungan().ambilUang(1600);
    System.out.print("Jumlah uang yang diambil: 1600");
    if (status) System.out.println(" OK");
    else System.out.println(" GAGAL");

    nasabah.getTabungan().simpanUang(2000);
    System.out.println("Jumlah uang yang disimpan: 2000");

    temp = nasabah.getTabungan().getSaldo();
    System.out.println("Saldo sekarang: " + temp);
  }
}
```

Maka akan menghasilkan *output* seperti berikut ini:

```bash
Nasabah atas nama: Agus Daryanto
Saldo awal: 5000
Jumlah uang yang disimpan: 3000
Jumlah uang yang diambil: 6000 OK
Jumlah uang yang disimpan: 3500
Jumlah uang yang diambil: 4000 OK
Jumlah uang yang diambil: 1600 GAGAL
Jumlah uang yang disimpan: 2000
Saldo sekarang: 3500
```

---

## Kesimpulan

- ***Package*** adalah suatu cara untuk mengelola *class*-*class*.
- ***Import Class*** digunakan untuk menghubungkan *class*-*class* di luar *package*.
- ***this*** digunakan dalam sebuah *class* untuk menyatakan *object* sekarang.
