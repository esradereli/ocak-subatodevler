
//Java nedir? Nerelerde kullanılır?
//Java nesne yönelimli platformlardan bağımsız çok amaçlı bir proglamlama dilidir.Web uyg. mobil uyg. masaüstü yazılımlar, büyük ölçekli kurumsal uyg. kullanılır.

//JDK:Java Development kit. Uygulamaları geliştirmek için gerekli olan araçlar ve kütüphaneleri içerir. İçinde JRE ve geliştirme araçları bulundurur.
//JRE:Java Runtime Environment. Programları çalıştırmak için gerekli olan ortamdır. İçinde JVM ve kütüphaneler bulunur.
//JVM:Java Virtual Machine. Kodları çalıştıran sanal makinedir.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String name= scanner.nextLine();

        System.out.println("Merhaba "+name);
        scanner.close();
    }
}