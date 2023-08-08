
import java.util.Scanner;


public class vucutkitle {
    public static void main(String[] args) 
 {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuzu giriniz: ");
        long kilo = scanner.nextInt();
        
        System.out.print("Boyunuzu giriniz(Örneğin: 1,75) : ");
        double boy = scanner.nextDouble();
        
        double bki= kilo/(boy*boy);
        
        System.out.println("Beden kitle endexiniz : "+ bki );
    }
}
