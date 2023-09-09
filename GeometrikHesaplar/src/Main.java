
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    
    String islemler ="İşlemler..\n"
               +"1. İşlem Kare alan hesapla\n"
               +"2. İşlem Üçgen alan hesapla\n"
               +"3. İşlem Daire alan hesapla\n"
               +"4. İşlem Çıkış";
    
    
        while (true) { 
            System.out.println(islemler);
            System.out.print("Hangi Şeklin Alanı Hesaplanacak :");
            String sekilTürü = scanner.nextLine();
            
            Sekil sekil =null;
            
            switch (sekilTürü) {
                case "q":
                    System.out.println("Programdan Çıkılıyor...");
                    break;
                case "1":
                    System.out.print("Karenin kenarı :");
                    int kenar =scanner.nextInt();
                    scanner.nextLine();
                    
                    sekil = new Kare("Kare1",kenar);
                    
                    sekil.alanHesap();
                    break;
                case "2":
                    System.out.print("Kenar 1 :");
                    int kenar1 = scanner.nextInt();
                    
                    System.out.print("Kenar 2 :");
                    int kenar2 = scanner.nextInt();
                    
                    System.out.print("Kenar 3 :");
                    int kenar3 = scanner.nextInt();
                    scanner.nextLine();
                    
                    sekil = new Ucgen("Üçgen 1", kenar1, kenar2, kenar3);
                    
                    sekil.alanHesap();
                    break;
                case "3":
                    System.out.print("Dairenin Yarı çapı: ");
                    int yariCap =scanner.nextInt();
                    scanner.nextLine();
                    sekil=new Daire("Daire ",yariCap);
                    sekil.alanHesap();
                    break;
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }
            
        }
    }
}