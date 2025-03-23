import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total=0;
        System.out.print("Sayı giriniz: ");
        int number=scanner.nextInt();
        for(int i=0;i<=number;i++){
            total+=i;
        }
        System.out.println("Toplam: "+total);

    }
}