# Modul 7: Overloading dan Overriding

## Dasar Teori

***Overloading*** adalah suatu keadaan di mana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama. Contoh:

```java
public void print(String temp) {
  System.out.println("Name: " + name);
  System.out.println("Address: " + address);
  System.out.println("Age: " + age);
}

public void print(double eGrade, double mGrade, double sGrade) {
  System.out.println("Name: " + name);
  System.out.println("Math Grade: " + mGrade);
  System.out.println("English Grade: " + eGrade);
  System.out.println("Science Grade: " + sGrade);
}
```

*Overloading* ini dapat terjadi pada *class* yang sama atau pada suatu *parent class* dan *subclass*-nya. *Overloading* mempunyai ciri-ciri sebagai berikut:

- Nama *method* harus sama
- Daftar parameter harus berbeda
- Return type boleh sama juga boleh berbeda

***Overriding*** tidak sama dengan *overloading*. *Overriding* merupakan mekanisme di mana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. *Overriding* mempunyai ciri-ciri sebagai berikut:

- Nama *method* harus sama
- Daftar parameter harus sama
- Return type harus sama

Berikut ini contoh terjadinya *overriding* di mana *method* `RupiahVsDolar()` pada *class* `Sekarang` meng-*override* *method* `RupiahVsDolar()` pada *class* `Dulu`.

```java
class Dulu {
  public String RupiahVsDolar() {
    System.out.println("Rp 10.000");
  }
}

class Sekarang extends Dulu {
  public String RupiahVsDolar() {
    System.out.println("Rp 14.000");
  }
}
```

Method yang terkena *override* (*overiden method*) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng-*override* (*overriding method*).

---

## Praktikum

- **Percobaan 1:** Melakukan Overloading pada method
  
  [A](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul7/src/com/nawawi/pbo/modul7/latihan/A.java)  
  [B](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul7/src/com/nawawi/pbo/modul7/latihan/B.java)  
  [C](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul7/src/com/nawawi/pbo/modul7/latihan/C.java)  
  [Overload](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul7/src/com/nawawi/pbo/modul7/latihan/Overload.java)

- **Percobaan 2:** Melakukan Overloading pada method
  
  [Overload1](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul7/src/com/nawawi/pbo/modul7/latihan/Overload1.java)

---

## Kesimpulan

***Overloading*** adalah suatu keadaan di mana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama.

***Overriding*** tidak sama dengan *overloading*. *Overriding* merupakan mekanisme di mana sebuah metode dapat dideklarasikan ulang pada kelas turunannya.
