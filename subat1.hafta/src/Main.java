//Array aynı türde birden fazla değeri saklayan veri yapısıdır.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("5 sayı girin: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Girilen sayılar: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
