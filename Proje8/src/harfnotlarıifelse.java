
import java.util.Scanner;

public class harfnotlarıifelse
{
    public static void main(String[] args) 
    {
        Scanner notal = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int not = notal.nextInt();
        
        if(not >100)
        {
            System.out.print("Geçerli sayı giriniz");
        }
        
        else if (not >=90)
        {
            System.out.println("Harf notunuz A1 'BAŞARILI'");
        }
        else if (not >=85)
        {
            System.out.println("Harf notunuz A2 'BAŞARILI'");
        }
        else if (not >=75)
        {
            System.out.println("Harf notunuz B1 'BAŞARILI'");
        }
        else if (not >=70)
        {
            System.out.println("Harf notunuz B2 'BAŞARILI'");
        }
        else if (not >=65)
        {
            System.out.println("Harf notunuz C1 'BAŞARILI'");
        }
        else if (not >=60)
        {
            System.out.println("Harf notunuz C2 'BAŞARILI'");
        }
        else if (not >=55)
        {
            System.out.println("Harf notunuz D1 'BAŞARILI'");
        }
         else if (not >=50)
        {
            System.out.println("Harf notunuz D2 'BAŞARILI'");
        }
         else if (not >=0)
        {
            System.out.println("Harf notunuz F3 'BAŞARISIZ'");
        }
               
    }

}
