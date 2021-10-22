# Modul 2: Dasar Pemrograman Java

## Dasar Teori
- **Keyword dalam Java**

  Keyword (atau disebut Reserverd Keyword) adalah identifier yang telah ditetapkan dalam bahasa pemrograman Java yang tidak dapat digunakan sebagai identifier *variable*, *method*, *class*, atau yang lainnya.
  
  Identifier adalah urutan dari satu atau lebih karakter yang kemudian dijadikan nama untuk sebuah *package*, *class*, *interface*, *method*, atau *variable*. Karakter pertama harus merupakan karakter pertama yang valid (huruf, `$`, `_`).

  
  Berikut ini keyword dalam Java:
  
  |           |          |            |            |              |
  |-----------|----------|------------|------------|--------------|
  | abstract  | continue | for        | new        | switch       |
  | assert*** | default  | goto*      | package    | synchronized |
  | boolean   | do       | if         | private    | this         |
  | break     | double   | implements | protected  | throw        |
  | byte      | else     | import     | public     | throws       |
  | case      | enum**** | instanceof | return     | transient    |
  | catch     | extends  | int        | short      | try          |
  | char      | final    | interface  | static     | void         |
  | class     | finally  | long       | strictfp** | volatile     |
  | const*    | float    | native     | super      | while        |
  
  > `*not used` `**added in 1.2` `***added in 1.4` `****added in 5.0`

  ***sumber:***  
  *https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html*  
  *https://docs.oracle.com/cd/E19798-01/821-1841/bnbuk/index.html*

  ---
  
- **Tipe Dasar**

  Bahasa pemrograman Java bertipe statis, yang berarti bahwa semua variabel harus dideklarasikan terlebih dahulu sebelum dapat digunakan. Delapan tipe data primitif yang didukung oleh bahasa pemrograman Java adalah:
  
  |   Tipe  | Panjang Bit |            Range            |
  |:-------:|:-----------:|:---------------------------:|
  |   byte  |    8-bit    |        `-128` – `127`       |
  |  short  |    16-bit   |     `-32.768` – `32.767`    |
  |   int   |    32-bit   |       `-2³¹` – `2³¹-1`      |
  |   long  |    64-bit   |       `-2⁶³` – `2⁶³-1`      |
  |  float  |    32-bit   |              -              |
  |  double |    64-bit   |              -              |
  | boolean |    1-bit    |              -              |
  |   char  |    16-bit   |   `'\u0000'` – `'\uffff'`   |
  
  Selain delapan tipe data primitif yang tercantum di atas, bahasa pemrograman Java juga menyediakan dukungan khusus untuk string karakter melalui kelas `java.lang.String`. Class `String` secara teknis bukan tipe data primitif, tapi dukungan khusus yang diberikan kepadanya oleh bahasa Java.
  
  Nilai default untuk masing-masing tipe adalah sebagai berikut:
  
  |             Tipe            | Nilai Default |
  |:---------------------------:|:-------------:|
  |             byte            |      `0`      |
  |            short            |      `0`      |
  |             int             |      `0`      |
  |             long            |      `0L`     |
  |            float            |     `0.0f`    |
  |            double           |     `0.0d`    |
  |             char            |   `'\u0000'`  |
  | String (atau *object* lain) |     `null`    |
  |           boolean           |    `false`    |
  
  ***sumber:** https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html*
  
  ---
  
- **Variabel**

  Variabel adalah wadah untuk menyimpan nilai data. Untuk membuat sebuah variabel, tentukan terlebih dahulu tipe datanya, kemudian berikan nilainya.
  
  > **Sintaks**
  > 
  > ```java
  > type variable = value;
  > ```

  Dimana *type* adalah salah satu tipe data dalam Java, dan *variable* adalah nama variabel. Tanda sama dengan `=` digunakan untuk memberikan nilai pada variabel.
  
  Untuk penamaan variabel dalam Java ada ketentuan umumnya (disebut *Convention*/Konvensi), yaitu:
  
  - Nama variabel *case-sensitive* (huruf kecil dan besar dianggap berbeda). Sebuah nama variabel dapat berupa identifier apa pun. Tetapi, konvensinya adalah selalu diawali dengan huruf, bukan `$` atau `_`.
  - Karakter selanjutnya bisa huruf, angka, `$`, atau `_`. Konvensinya (dan hal yang umum) berlaku juga untuk aturan ini.
  - Jika nama yang digunakan hanya satu kata, ejakan kata tersebut dalam huruf kecil semua. Jika terdapat dua kata atau lebih, kapitalkan huruf pertama setiap kata selanjutnya. Contohnya `anakAyam`, `pendapatanTahunan`, dll.
  - Jika variabel tersebut termasuk konstanta (variabel yang tidak dapat dirubah nilainya setelah dideklarasikan), maka konvensinya sedikit berubah. Setiap huruf dikapitalkan dan setiap kata dipisah dengan `_`. Contohnya `final int PI = 3.14;`, `final int JUMLAH_GERIGI = 6;`, dll.

  ***sumber:***  
  *https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html*  
  *https://www.w3schools.com/java/java_variables.asp*

  ---
  
- **Casting dan Promotion**

  Mengubah tipe data yang lebih tinggi menjadi yang lebih rendah disebut *Casting*/*Narrowing*. Sedangkan mengubah tipe data yang lebih rendah menjadi yang lebih tinggi disebut *Promotion*/*Widening*.
  
  > **Sintaks**
  > 
  > ```java
  > int p = (int) 10L;
  > long i = 10;
  > ```
  
  ***sumber:***  
  *https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html*  
  *https://www.w3schools.com/java/java_type_casting.asp*  
  *https://www.geeksforgeeks.org/type-conversion-java-examples/*  
  *https://www.javatpoint.com/type-casting-in-java*
  
  ---

## Praktikum
**Soal:**
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A+B-C

**Jawaban:**
1. [Jawaban 1](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul2/src/com/nawawi/pbo/modul2/latihan/BigInteger.java)

```java
public class BigInteger {
  public static void main(String[] args) {
    long p = 2147483648;
  }
}
```

Sintaks di atas akan menampilkan error:

```bash
java: integer number too large: 2147483648
```

Kenapa bisa ada error angka terlalu besar? Sedangkan tipe data `long` batas maksimumnya adalah 2⁶³-1 (9.223.372.036.854.775.999). Hal itu dikarenakan tipe data `long` akhirannya harus dengan huruf `L` atau `l`. Jika tidak, maka akan dianggap tipe data `int`.

```java
public class BigInteger {
  public static void main(String[] args) {
    long p = 2147483648L;
  }
}
```

> ***Catatan:** Direkomendasikan menggunakan* `L` *daripada* `l` *karena huruf* `l` *susah dibedakan dengan angka* `1` *.*

***sumber:** https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html*

2. [Jawaban 2](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul2/src/com/nawawi/pbo/modul2/latihan/AnakAyam.java)
3. [Jawaban 3](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul2/src/com/nawawi/pbo/modul2/latihan/Abc.java)

---

## Kesimpulan

Mengulangi code dasar perintah java dan tipe dasar dari variable
