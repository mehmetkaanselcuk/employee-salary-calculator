# Çalışan Maaş Hesaplama Sistemi (Employee Salary Calculator)

Bu proje, Java ile yazılmış basit bir nesne yönelimli programlama (OOP) uygulamasıdır. 

## Özellikler
- Maaş üzerinden vergi hesaplama (%3)
- Haftalık 40 saati aşan mesailer için bonus hesaplama
- İşe başlangıç yılına göre zam oranı hesaplama
- Bilgilerin `toString()` metodu ile yazdırılması

## Kullanım
`Employee` sınıfı ile çalışan oluşturulur. `tax()`, `bonus()` ve `raiseSalary()` metotları ile gerekli hesaplamalar yapılır.

## Örnek
```java
Employee e1 = new Employee("Kemal", 2000, 45, 1985);
System.out.println(e1);
