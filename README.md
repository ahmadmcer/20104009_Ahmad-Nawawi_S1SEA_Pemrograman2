# Modul 9: Exception

## Dasar Teori

***Exception*** adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan *exception handling*. Karena dalam java segala sesuatu merupakan objek, maka *exception* juga direpresentasikan dalam seubah objek yang menjelaskan tentang *exception handling* tersebut. Contoh *exception* adalah pembagian bilangan dengan 0. pengisian array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception, yaitu:

1. Menangani sendiri exception tersebut.
2. Meneruskannya ke luar dengan cara membuat objek tentang *exception* tersebut dan melemparkannya (*throw*) keluar agar ditangani oleh kode yang memanggil *method* (*method* yang didalamnya terdapat *exception*) tersebut.

Ada lima *keyword* yang digunakan oleh Java untuk menangani exception, yaitu ***try***, ***catch***, ***finally***, ***throw***, dan ***throws***.

- **Tipe-Tipe Exception**

  Pada *exception*, *superclass* tertinggi adalah *class Throwable*, tetapi kita hampir tidak pernah menggunakan *class* ini secara langsung. Di bawah *class Throwable* terdapat dua *subclass*, yaitu *class Error* dan *class Exception*.
  
  ![image](https://user-images.githubusercontent.com/7505740/147116490-a4a9b916-3914-4659-a892-1603bd2d53c1.png)

- **Penggunaan Blok *try-catch***

  Untuk menangani *exception* dalam program, dengan meletakkan kode program yang memungkinkan terjadinya *exception* di dalam blok *try*, diikuti dengan blok *catch* yang menentukan jenis *excpetion* yang ingin ditangani. Contoh:
  
  ```java
  public class Percobaan2 {
    public static void main(String[] args) {
      int[] a = new int[5];
      try {
        a[5] = 100;
      } catch (ArrayIndexOutOfBoundException e) {
        System.out.println("Indeks Array melebihi batas");
      }
      System.out.println("Setelah blok try-catch");
    }
  }
  ```
  
  Output:
  
  ```bash
  Terjadi exception karena Indeks Array melebih batas Setelah block try-catch
  ```
  
  Dapat terjadi kode yang terdapat dalam blok *try* mengakibatkan lebih dari satu exception. Dalam hal ini, kita dapat menuliskan lebih dari satu blok *catch*. Contoh:
  
  ```java
  public class Percobaan5 {
    public static void main(String[] args) {
      int bil = 10;
      String[] b = {"a", "b", "c"};
      try {
        System.out.println(bil/0);
        System.out.println(b[3]);
      } catch (ArithmeticException e) {
        System.out.println("Error Aritmetik");
      } catch (ArrayIndexOutOfBoundException e) {
        System.out.println("Errr Kapasitas Array Melebih Batas");
      } catch (Exception e) {
        System.out.println("Terdapat Error");
      }
    }
  }
  ```

- **Menggunakan Keyword *finally***

  Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi *exception*, misalkan kita membuka file, hal ini memungkinkan terjadinya *exception* misal file tidak ada, file tidak bisa dibuka, selanjutnya yang harus dilakukan adalah menutup file tersebut.
  
  ```java
  public class Percobaan2 {
    public static void main(String[] args) {
      int[] a = new int[5];
      try {
        a[5] = 100;
      } catch (ArrayIndexOutOfBoundException e) {
        System.out.println("Terjadi exception karena Indeks Array melebih batas");
      } finally {
        System.out.println("Selalu Dijalankan");
      }
      System.out.println("Setelah blok try-catch");
    }
  }
  ```

- **Menggunakan Keyword *throw* dan *throws***

  Secara eksplisit, kita dapat melempar (*throw*) *exception* dari program menggunakan keyword *throw*. Jika *exception* tersebut adalah *checked exception*, maka pada *method* harus ditambahkan *throws*. Jika *exception* tersebut adalah *unchecked exception*, maka pada *method* tidak perlu ditambahkan *throws*.

  ```java
  public class Percobaan6 {
    public static void method1() throws FileNotFoundException {
      throw new FileNotFoundException("File Tidak Ada");
    }
    
    public static void main(String[] args) {
      try {
        method1();
      } catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
  ```

---

## Praktikum

- [Latihan 1](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul9/src/com/nawawi/pbo/modul9/latihan/Percobaan7.java)
- [Latihan 2](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul9/src/com/nawawi/pbo/modul9/latihan/Percobaan.java)
- [Latihan 3](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul9/src/com/nawawi/pbo/modul9/latihan/Demo.java)

---

## Kesimpulan

***Exception*** adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program.

Terdapat dua penanganan exception, yaitu:  
1. Menangani sendiri exception tersebut.
2. Meneruskannya ke luar dengan cara membuat objek tentang *exception* tersebut dan melemparkannya (*throw*) keluar agar ditangani oleh kode yang memanggil *method* (*method* yang didalamnya terdapat *exception*) tersebut.

Ada lima *keyword* yang digunakan oleh Java untuk menangani exception, yaitu ***try***, ***catch***, ***finally***, ***throw***, dan ***throws***.
