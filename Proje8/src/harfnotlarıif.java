
import java.util.Scanner;

public class harfnotlarıif 
{
    public static void main(String[] args) 
    {
        Scanner notal = new Scanner(System.in);
        System.out.print("Lütfen notunuzu giriniz : ");
        int not = notal.nextInt();
        
        if(not >= 0 && not <= 49)
        {
            System.out.println("Harf notunuz : F3  BAŞARISIZ");
        }
        if(not >= 50 && not <= 54)
        {
            System.out.println("Harf notunuz : D2  BAŞARILI");
        }
        if(not >= 55 && not <= 59)
        {
            System.out.println("Harf notunuz : D1  BAŞARILI");
        }
        if(not >= 60 && not <= 64)
        {
            System.out.println("Harf notunuz : C2  BAŞARILI");
        }if(not >= 65 && not <= 69)
        {
            System.out.println("Harf notunuz : C1  BAŞARILI");
        }
        if(not >= 70 && not <= 74)
        {
            System.out.println("Harf notunuz : B2  BAŞARILI");
        }
        if(not >= 75 && not <= 84)
        {
            System.out.println("Harf notunuz : B1  BAŞARILI");
        }
        if(not >= 85 && not <= 89)
        {
            System.out.println("Harf notunuz : A2  BAŞARILI");
        }
        if(not >= 90 && not <= 100)
        {
            System.out.println("Harf notunuz : A1  BAŞARILI");
        }
        if (not > 100)
        {
            System.out.println("Geçerli not giriniz.");
        }
        
        
    }
}
