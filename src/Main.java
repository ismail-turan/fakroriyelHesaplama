import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi,toplamCarpim=1,deneme=1;
        System.out.print("Sayi Giriniz :");
        sayi=scanner.nextInt();
        do {
            toplamCarpim=deneme*toplamCarpim;
            deneme++;
        }while (deneme<=sayi);
        System.out.print("Sonuç :"+toplamCarpim);
    }
}