# Modul 6: Konsep Inheritance

## Dasar Teori

Dengan konsep *inheritance*, sebuah *class* dapat mempunyai ***class* turunan**. Suatu *class* yang mempunyai *class* turunan dinamakan *parent class* atau *base class*. Sedangkan *class* turunan itu sendiri seringkali disebut *subclass* atau *child class*. Suatu *subclass* dapat mewarisi apa-apa yang dipunyai oleh *parent class*-nya. Kesimpulannya, boleh dikatakan bahwa suatu *subclass* adalah tidak lain hanya memperluas (*extend*) *parent class*-nya.

Dalam Java, untuk mendeklarasikan suatu *class* sebagai *subclass* dilakukan dengan cara menambahkan kata kunci *extends* setelah deklarasi nama *class*, kemudian diikuti dengan nama *parent class*-nya.

Berikut adalah contoh deklarasi *inheritance*:  
```java
public class B extends A {

}
```

Contoh di atas memberitahukan kompiler Java bahwa kita ingin extend *class* A ke *class* B. Dengan kata lain, *class* B adalah *subclass* dari *class* A, sedangkan *class* A adalah *parent class* dari *class* B.

Java hanya memperkenalkan adanya *single inheritance*. Konsep *single inheritance* hanya memperbolehkan suatu *subclass* mempunyai satu *parent class*. Dengan konsep *single inheritance* ini, masalah pewarisan akan dapat diamati dengan mudah.

Suatu *parent class* dapat tidak mewariskan sebagian *member*-nya kepada *subclass*-nya. Sejauh mana suatu member dapat diwariskan ke *class* lain, ataupun suatu member dapat diakses dari *class* lain, sangat berhubungan dengan *access control* (kontrol pengaksesan*.

Dalam Java, kontrol pengaksesan dapat digambarkan dalam tabel berikut ini:  
|  Modifier | Dalam Satu Class | Dalam Satu Package | Subclass | Class Manapun |
|:---------:|:----------------:|:------------------:|:--------:|:-------------:|
|  private  |         ✔        |          ❌         |     ❌    |       ❌       |
|  default  |         ✔        |          ✔         |     ❌    |       ❌       |
| protected |         ✔        |          ✔         |     ✔    |       ❌       |
|   public  |         ✔        |          ✔         |     ✔    |       ✔       |

Kata kunci *super* dipakai merujuk pada *member* dari *parent class*, sebagaimana kata kunci *this* yang dipakai untuk merujuk pada *member* dari *class* itu sendiri.

Ada beberapa hal yang harus diingat ketika menggunakan pemanggil *constructor super*:  
1. Pemanggil `super()` **HARUS DIJADIKAN PERNYATAAN PERTAMA** dalam *constructor*.
2. Pemanggil `super()` hanya dapat digunakan dalam definisi *constructor*.
3. Termasuk *constructor* `this()` dan pemanggil `super()` **TIDAK BOLEH TERJADI** dalam *constructor* yang sama.

Contoh:  
```java
public class Siswa {
  private int nilai;
  
  public setNilai(int nilai) {
    this.nilai = nilai;
  }
}
```

---

## Praktikum

- **Percobaan 1:** Menggunakan kata kunci *super*
  
  [Bentuk](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/Bentuk.java)  
  [Persegi](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/Persegi.java)  
  [PersegiTest](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/PersegiTest.java)
 
- **Percobaan 2:** Mendefinisikan *superclass* dan *subclass*
  
  [Person](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/Person.java)  
  [Student](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/Student.java)  
  [InheritDemo](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/InheritDemo.java)

- **Percobaan 3:** Kontrol pengaksesan
  
  [B](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/B.java)  
  [A](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/A.java)  
  [InheritanceTest](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/InheritanceTest.java)
  
  **Sekarang cobalah untuk mengkompilasi program di atas. Apa yang terjadi?**  
  Program eror.
  
  **Mengapa timbul pesan kesalahan?**  
  Karena *member-member* pada *class* A (sebagai *parent class* dari *class* B) menggunakan *modifier* *private*, yang mana mengakibatkan *class* B (sebagai *child class* dari *class* A) tidak bisa mengaksesnya.
  
  **Buatlah listing program yang benar sehingga tidak timbul pesan kesalahan tersebut!**  
  Dengan cara mengganti *modifier* pada *member-member* *class* A menjadi *protected* supaya *class* B bisa mengaksesnya.  
  ```java
  public class A {
    protected int x;
    protected int y;
    
    ...
  ```

- **Percobaan 4:** Konstruktor tidak diwariskan
  
  [Parent](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/Parent.java)  
  [Child](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul6/src/com/nawawi/pbo/modul6/latihan/Child.java)
  
  **Lakukan kompilasi pada *Child* di atas. Apa yang terjadi?**  
  Eror.

---

## Kesimpulan

Dengan konsep *inheritance*, sebuah *class* dapat mempunyai ***class* turunan**. Dalam Java, untuk mendeklarasikan suatu *class* sebagai *subclass* dilakukan dengan cara menambahkan kata kunci *extends* setelah deklarasi nama *class*, kemudian diikuti dengan nama *parent class*-nya. Java hanya memperkenalkan adanya *single inheritance*. Konsep *single inheritance* hanya memperbolehkan suatu *subclass* mempunyai satu *parent class*. Suatu *parent class* dapat tidak mewariskan sebagian *member*-nya kepada *subclass*-nya.
