
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("Çıkış için q'a basınız...");
        Scanner scanner = new Scanner(System.in);  
        
        while (true) {            
            System.out.print("Hangi Beyblade üretmek istiyorsunu:");
            String islem = scanner.nextLine(); // kullanıcıdan alınan veri islem e atandı
            
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else{
                BeybladeFabrikası fabrika=new BeybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeUret(islem);  //Polymorphism kullanılarak Beyblade fabrikasındaki metodlar kullanıldı
                
                if(beyblade == null){
                    System.out.println("Lütfen GEÇERLİ Beyblade ismi giriniz...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldır();
                    beyblade.kutsalCanavarOrtayaCıkar();
                }
            }
        }
    }
}
