
import java.util.Scanner;


public class tutarolcme 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız km başına kaç krş yazıyoru (örn: 0,32) : ");
        double a = scanner.nextDouble();
        
        System.out.print("Kaç km yol aldınız : ");
        int b = scanner.nextInt();
        
        double c = a*b;
        System.out.println("Toplam ödenecek ücret : " + c + " TL");
        
       
    }
   
}
