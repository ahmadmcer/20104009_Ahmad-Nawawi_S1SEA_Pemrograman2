# Modul 4: Dasar Pemrograman Berorientasi Objek

## Dasar Teori

**Information Hiding** adalah menyembunyikan *attribute* dan *method* suatu *object* dari *object* lain. Informasi dari suatu *class* disembunyikan agar anggota-anggota tersebut tidak dapat diakses dari luar. Adapun caranya adalah cukup dengan memberikan akses control ***private*** ketika mendeklarasikan suatu *attribute* atau *method*.

Contoh:  
```java
private int nilai;
```

---

**Encapsulation** adalah suatu cara untuk menyembunyikan implementasi detail dari suatu *class*. *Encapsulation* mempunyai dua hal mendasar, yaitu:

1. *Information Hiding*
2. Menyediakan suatu perantara (*method*) untuk pengaksesan data.

Contoh:  
```java
public class Siswa {
  private int nilai;
  
  public void setNilai(int n) {
    this.nilai = n;
  }
}
```

---

**Constructor** adalah suatu *method* yang pertama kali dijalankan pada saat pembuatan suatu *object*. *Constructor* ini merupakan *method* yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan dimiliki oleh *object*. *Constructor* dipanggil pada saat proses instansiasi *class* menjadi *object*. Beberapa karakteristik yang dimiliki oleh *constructor*:

1. *Method constructor* harus memiliki nama yang sama dengan nama *class*.
2. Tidak mengembalikan suatu nilai (tidak ada keyword *return*).
3. Satu *class* memiiliki lebih dari satu *constructor* (*overloading constructor*).
4. Dapat ditambah *access modifier public*, *private*, *protected*, maupun *default*.
5. Suatu *constructor* bisa dipanggil oleh *constructor* lain dalam satu *class*.

Struktur dari *constructor* yaitu:  
```java
class NamaClass {

  NamaClass() {
  
    // Isi constructor
    
  }
  
  // Isi dari class
  
}
```

Contoh:  
```java
public class Siswa {
  private int nilai;
  private String nama;
  
  public Siswa(int n, String m) {
    this.nilai = n;
    this.nama = m;
  }
}
```

---

**Overloading Constructor** merupakan suatu *class* yang mempunyai lebih dari satu *constructor* dengan syarat daftar parameternya tidak boleh ada yang sama.

Contoh:  
```java
public class Siswa {
  private int nilai;
  
  public Siswa() {
    this.nilai = 0;
  }
  
  public Siswa(int n) {
    this.nilai = n;
  }
}
```

*Constructor* tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator *new* pada pembentukan sebuah *class*.

---

## Praktikum
**Soal:**

Buatlah dua *class* dalam *project* kalian kemudian beri nama dan isi sebagai berikut:

```java
public class StudentRecord {
  private String name;
  private String address;
  private int age;
  private double mathGrade;
  private double englishGrade;
  private double scienceGrade;
  private double average;
  private static int studentCount;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverage() {
    return (mathGrade + englishGrade + scienceGrade) / 3;
  }

  public static int getStudentCount() {
    return studentCount;
  }
}
```

```java
public class StudentRecordExample {
  public static void main(String[] args) {
    StudentRecord wahyu = new StudentRecord();
    StudentRecord ini = new StudentRecord();
    StudentRecord nama = new StudentRecord();

    wahyu.setName("Wahyu");
    ini.setName("Ini");
    nama.setName("Nama");

    System.out.println(wahyu.getName());
    System.out.println("Hitung: " + StudentRecord.getStudentCount());
  }
}
```

**Jawaban:**  
[Jawaban 1](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul4/src/com/nawawi/pbo/modul4/latihan/StudentRecord.java)  
[Jawaban 2](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul4/src/com/nawawi/pbo/modul4/latihan/StudentRecordExample.java)

*Class* StudentRecord menetapkan semua visibilitas *attribute*-nya menjadi *private* sebagai pencegahan akses dari luar *class*. Metode ini disebut *Encapsulation*.

```java
private String name;
private String address;
private int age;
private double mathGrade;
private double englishGrade;
private double scienceGrade;
private double average;
private static int studentCount;
```

Kemudian supaya dari luar *class* StudentRecord bisa mendapatkan data serta menetapkan data, maka dibuatlah *getter* dan *setter*-nya.

Untuk *getter*-nya adalah:  
1. Mendapatkan name  
   ```java
   public String getName() {
     return name;
   }
   ```

2. Mendapatkan average  
   ```java
   public double getAverage() {
     return (mathGrade + englishGrade + scienceGrade) / 3;
   }
   ```

3. Mendapatkan studentCount
   ```java
   public static int getStudentCount() {
     return studentCount;
   }
   ```

Untuk *setter*-nya adalah:  
1. Menetapkan name
   ```java
   public void setName(String name) {
     this.name = name;
   }
   ```

Untuk mengetahui output dari *class* StudentRecord, maka *class* StudentRecordExample dijadikan tempat untuk membuat *object* baru berdasarkan *class* StudentRecord.

*Object* wahyu dibuat berdasarkan blueprint *class* StudentRecord.  
```java
StudentRecord wahyu = new StudentRecord();
```

Kemudian *attribute* name dari *object* wahyu ditetapkan dengan nilai "Wahyu".  
```java
wahyu.setName("Wahyu");
```

Output yang akan dihasilkan sebagai berikut:  
```bash
Wahyu
Hitung: 0
```

---

## Kesimpulan

- *Encapsulation* digunakan untuk melindungi data suatu *class* dari akses luar *class* tersebut.
- *Constructor* digunakan untuk menginisialisasi variabel-variabel secara instan pada saat instansiasi *object* baru.
- *Overloading Constructor* digunakan untuk membuat *constructor* lebih dari satu, sehingga
