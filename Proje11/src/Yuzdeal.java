
import java.util.Scanner;

public class Yuzdeal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Programdan çıkmak için '0' a basınız...");
        
        while (true) 
        {      
            System.out.print("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();
            
            if(sayi ==0)
            {
                break;
            }
            
            else
            {
            System.out.print("Yüzde kaçı :");
            double yuzde =scanner.nextInt();
            
            System.out.println("Sonuç :"+((sayi*yuzde)/100));
            }
            
        }
    }
}
