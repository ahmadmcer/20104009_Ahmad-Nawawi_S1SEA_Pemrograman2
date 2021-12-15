# Modul 8: Polimorfisme

## Dasar Teori

***Polymorphism*** (Polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk *class* yang berbeda. Polimorfisme ini terjadi pada saat suatu *object* bertipe *parent class* pemanggilan *constructor*-nya melalui *subclass*. Misalnya deklarasi pertnyataan berikut ini:

```java
Employee employee = new Manager();
```

***Virtual Method Invocation (VMI)*** bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat *object* yang sudah dibuat tersebut memanggil *overriden method* pada *parent class*, kompiler Java akan melakukan *invocation* (pemanggilan) terhadap *overriding method* pada *subclass*, di mana yang seharusnya dipanggil adalah *overriden method*. Berikut contoh terjadinya VMI:

```java
class Parent {
  int x = 5;
  public void info() {
    System.out.println("Ini class Parent");
  }
}

class Child extends Parent {
  int x = 10;
  public void info() {
    System.out.println("Ini class Child");
  }
}

public class Tes {
  public static void main(String args[]) {
    Parent tes = new Child(); 
    System.out.println("Nilai x = " + tes.x);
    tes.info();
  }
}
```

---

## Praktikum

**Virtual Method Invocation**
  
[Pegawai](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul8/src/com/nawawi/pbo/modul8/latihan/Pegawai.java)  
[Gaji](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul8/src/com/nawawi/pbo/modul8/latihan/Gaji.java)  
[VirtualDemo](https://github.com/ahmadmcer/20104009_Ahmad-Nawawi_S1SEA_Pemrograman2/blob/modul8/src/com/nawawi/pbo/modul8/latihan/VirtualDemo.java)

**Analisis**  
Pada class VirtualDemo kita akan menampilkan statement ```Memanggil mailCheck Berdasarkan Referensi Gaji --``` dan ```Memanggil mailCheck Berdasarkan Referensi Pegawai--```. Lalu kita juga memanggil objek ```s.mailcheck``` dan objek ```e.mailcheck``` sehingga parameter objek gaji dan pegawai tidak akan ditampilkan pada program karena program main tidak memintanya untuk ditampilkan.

---

## Kesimpulan

***Polymorphism*** (Polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk *class* yang berbeda.

***Virtual Method Invocation (VMI)*** bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat *object* yang sudah dibuat tersebut memanggil *overriden method* pada *parent class*, kompiler Java akan melakukan *invocation* (pemanggilan) terhadap *overriding method* pada *subclass*, di mana yang seharusnya dipanggil adalah *overriden method*.
