# Modul 3: Pengenalan Pemrograman Berorientasi Objek

## Dasar Teori
- **Pemrograman Berorientasi Objek**

  Pemrograman Berorientasi Objek (PBO) atau dalam bahasa Inggris *Object Oriented Programming* (OOP) merupakan merupakan suatu metode pemrograman yang berorientasi kepada objek.
  
  Tujuan PBO/OOP adalah meminimalisir program dan membuatnya tertata rapi. Selain itu juga untuk mempercepat pembuatan aplikasi. Dengan adanya PBO/OOP, program yang semakin besar maupun kompleks akan membuat kode mudah di-*maintenance*.

  ***sumber:** https://www.dicoding.com/blog/apa-itu-oop-pada-java-beserta-contohnya/*

  ---
  
- **Mendeklarasikan Suatu Class**

  Class adalah bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat. Class merupakan *blueprint* dari sebuah objek atau cetakan untuk membuat objek. Contoh *class* sebagai berikut ini.
  
  ```java
  public class Kendaraan {
    
    // Isi Class
    
  }
  ```
  
  *Class* akan merepresentasikan objek yang mau dibuat. Jadi dalam membuat nama kelas harus disesuaikan dengan objek yang akan dibuat. Penulisan nama *class* memiliki aturan. Yakni dengan format **PascalCase**. Apa itu? Penulisannya diiawali dengan huruf kapital. Jika nama variabel tersusun dari dua kata atau lebih maka tidak perlu diberi spasi di antaranya dan diawali dengan huruf kapital pula.

  Misal: `class MakananKucing`, `class Senjata`, dan `class SignIn`.

  Sedangkan *object* adalah sebuah variabel *instance* yang merupakan wujud dari *class*. *Instance* merupakan wujud dari sebuah kelas. Sebuah objek digambarkan dengan *variable* dan *method*.

  *Class* berisi dari beberapa kumpulan definisi variabel dan fungsi yang menggambarkan sebuah objek.
  
  ***sumber:** https://www.dicoding.com/blog/apa-itu-oop-pada-java-beserta-contohnya/*
  
  ---
  
- **Mendeklarasikan Suatu Atribut**

  Atribut merupakan bagian dari sebuah kelas yang masih berhubungan erat dari kelas tersebut. Atribut bisa juga disebut sebagai properti atau *properties* dari sebuah *class*. Contohnya ketika kita punya sebuah `class Motor`, maka kita dapat menambahkan atribut seperti kecepatan motor, umur motor, ukuran, ban, warna dsb. Untuk lebih detailnya, kita contohkan pada program berikut:
  
  ```java
  public class Kendaraan {
    
    // Atribut
    public int bahanBakar;
    public int kecepatan;
    
  }
  ```

  Penggunaan atribut berlaku dari kurung kurawal awal (`{`) sampai dengan sebelum kurung kurawal akhir (`}`). Ini dinamakan scope. Untuk penulisannya menggunakan format **lowerCamelCase**. Jadi untuk kata pertama diawali dengan huruf kecil, sedangkan kata selanjutnya diawali dengan huruf kapital. Sama seperti PascalCase, penggunaan spasi tidak diperkenankan ketika menghubungkan dua kata atau lebih dari sebuah nama properti.

  Contohnya `length`, `width`, `apple`, `speed`, `listMovies`, dll.

  ***sumber:** https://www.dicoding.com/blog/apa-itu-oop-pada-java-beserta-contohnya/*

  ---
  
- **Mendeklarasikan Suatu Metode**

  *Method* berperan menjelaskan bagaimana suatu atribut beraksi. Peran yang dimaksud berupa tingkah laku (*behavior*) yang dapat digambarkan oleh suatu *method*. Misal `class Manusia`. Manusia tentu memiliki *method* berupa tingkah laku, seperti berpikir, berjalan, berbicara, makan dll. Maka tentunya *method* dapat disesuaikan dengan program yang dibuat.
  
  Kita akan coba implementasikan ke dalam sebuah kode Java. Pertama, kita bisa buat `class Kendaraan`.
  
  ```java
  public class Kendaraan {
  
    // Atribut dari class Kendaraan
    public int bensin;
    public int kecepatan;
  
    // Method dari class Kendaraan
    public void isiBensin() {
      System.out.println("Mengisi bahan bakar mobil sebanyak " + this.bensin + "L.");
    }
    
    public void jalan() {
      System.out.println("Mobil berjalan dengan kecepatan " + this.kecepatan + "km/jam.");
    }
  
  }
  ```
  
  ***sumber:** https://www.dicoding.com/blog/apa-itu-oop-pada-java-beserta-contohnya/*
  
  ---
  
- **Mengakses Anggota Suatu Object**

  Setelah membuat `class Vehicle`, kemudian kita bisa buat `class Car` untuk mengaksesnya.
  
  ```java
  public class Mobil {
    public static void main(String[] args) {
    
      // Memanggil class Kendaraan
      Kendaraan mobil = new Kendaraan();
      
      // Atribut atau properti kendaraan Mobil
      mobil.bensin = 10;
      mobil.kecepatan = 80;
      
      // Method atau tingkah laku kendaraan Mobil
      mobil.isiBensin();
      mobil.jalan();
    
    }
  }
  ```
  
  Kita dapat menjalankan program tersebut, maka *output*-nya seperti ini:
  
  ```bash
  Mengisi bahan bakar mobil sebanyak 10L.
  Mobil berjalan dengan kecepatan 80km/jam.
  ```
  
  ***sumber:** https://www.dicoding.com/blog/apa-itu-oop-pada-java-beserta-contohnya/*

## Praktikum
**Soal:**
Mengimplementasikan UML Class Diagram dalam program untuk `class Tabungan`

| Tabungan |
|---|
| +saldo: int |
| +Tabungan(saldo: int)<br>+getSaldo(): int<br>+simpanUang(jumlah: int)<br>+ambilUang(jumlah: int): boolean |

**Jawaban:**
[Jawaban](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul2/src/com/nawawi/pbo/modul3/latihan/Tabungan.java)

```java
public class Tabungan {
  private int saldo;

  Tabungan(int saldo) {
    this.saldo = saldo;
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
```

Lalu kita tes dengan program di bawah ini:

```java
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
      System.out.println("OK");
    } else {
      System.out.println("GAGAL");
    }

    tabungan.simpanUang(1000);
    System.out.println("Jumlah uang yang disimpan: 1000");

    status = tabungan.ambilUang(10000);
    System.out.print("Jumlah uang yang diambil: 10000");
    if (status) {
      System.out.println("OK");
    } else {
      System.out.println("GAGAL");
    }

    status = tabungan.ambilUang(2500);
    System.out.print("Jumlah uang yang diambil: 2500");
    if (status) {
      System.out.println("OK");
    } else {
      System.out.println("GAGAL");
    }

    tabungan.simpanUang(2000);
    System.out.println("Jumlah uang yang disimpan: 2000");

    System.out.println("Saldo sekarang: " + tabungan.getSaldo());
  }
}
```

Makan akan menghasilkan *output* seperti berikut ini:

```bash
Saldo awal: 10000
Jumlah uang yang disimpan: 8000
Jumlah uang yang diambil: 7000 OK
Jumlah uang yang disimpan: 1000
Jumlah uang yang diambil: 10000 OK
Jumlah uang yang diambil: 2500 GAGAL
Jumlah uang yang disimpan: 2000
Saldo sekarang: 4000
```

---

## Kesimpulan

Pemrograman Berbasis Objek (PBO) atau *Object Oriented Programming* (OOP) bisa membuat kode lebih rapi dan efisien.
