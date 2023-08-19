
import java.util.Scanner;

public  class Armstrongsayi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bİr sayı girniz :");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısı :");
        int basamak_sayisi=scanner.nextInt();
        
        int gecici= sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici  % 10;
            gecici /= 10;
            
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
        }
        while(gecici>0);
        
        if (sayi==toplam)
        {
            System.out.println("Bu bir armstrong sayısıdır.");
        }
        else
        {
            System.out.println("Bu armstrong sayısı değildir...");
        }
    }
   
}