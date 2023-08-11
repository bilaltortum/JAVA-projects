
import java.util.Scanner;

public class buyukvekucuksayi 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İlk sayı: ");
        int a = scanner.nextInt();
        System.out.print("İkinci sayı: ");
        int b = scanner.nextInt();
        System.out.print("Üçüncü sayı: ");
        int c= scanner.nextInt();
        System.out.print("Dördüncü sayı: ");
        int d = scanner.nextInt();
        
        int max =-1;
        int min =-2222;
        
        if (a<b){min=a;}
        if (b<c){min=b;}
        if (c<d){min=c;}
        if (d<a){min=d;}

        if(a >= b && a >= c && a >= d)
        {
            max = a; 
        }
        else if (b >= a && b >= c && b >= d)
        {
            max = b;
        } 
        else 
        {
            max = d;
        }
            
        System.out.println("Girilen en büyük sayı : " + max);
        System.out.println("Girilen en küçük sayı : " + min);
        
        
    }
}
