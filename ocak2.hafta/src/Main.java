
//byte= -128 ile 127 arası
//short= -32,768 ile 32,767 arası
//int= -2,147,483,647 ile 2,147,483,647 arası
//long= Çok büyük tam sayılar
//float= Ondalık sayılar
//double=Ondalık sayılar
//char=Tek bir karakter tutar
//boolean= true ya da false değeri

/*public class Main {
   public static void main(String[] args) {
       int a=10, b=3;
        double c=3.5;
        System.out.println(a + b);
        System.out.println(a + c);

    }
}
a artı b=13 a artı c=13.5 olur. double olan baskın olduğu için */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);
        scanner.close();
    }
}
