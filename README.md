# Modul 2: Dasar Pemrograman Java

## Dasar Teori
- **Keyword dalam Java**

  Keyword (atau sering disebut Reserverd Keyword) adalah identifier yang telah dipesan untuk didefinisikan sebelumnya oleh Java untuk tujuan tertentu. Anda tidak dapat dapat menggunakan keyword sebagai nama *variable*, *class*, dan *method*.
  
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

  ***sumber:** https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html*
  
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
  
- **Variabel**

  Penjelasan Teori
  
- **Casting dan Promotion**

  Penjelasan Teori

## Praktikum
Soal : 
1. Aritmatika
2. CobaUnicode
3. InputKeyboard
4. Tipe

Jawaban :
1. [Jawaban Soal 1](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul0/src/com/nawawi/pbo/modul0/percobaan/Aritmatika.java)
2. [Jawaban Soal 2](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul0/src/com/nawawi/pbo/modul0/percobaan/CobaUnicode.java)
3. [Jawaban Soal 3](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul0/src/com/nawawi/pbo/modul0/percobaan/InputKeyboard.java)
4. [Jawaban Soal 4](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul0/src/com/nawawi/pbo/modul0/percobaan/Tipe.java)

<hr>

## Kesimpulan
Mengulangi code dasar perintah java dan tipe dasar dari variable
