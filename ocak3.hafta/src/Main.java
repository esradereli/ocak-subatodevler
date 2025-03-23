/*Koşullu ifade if-else farklı kod bloklarının çalışmasını sağlar. Susadıysan su iç susamadıysan su içme gibi.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çift.");
        } else {
            System.out.println("Girilen sayı tek.");
        }
        scanner.close();
    }
}
/*
if (sayi > 0) {
        System.out.println("Pozitif");
} else if (sayi < 0) {
        System.out.println("Negatif");
} else {
        System.out.println("Sıfır");
}
*/