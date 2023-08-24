
import java.util.Scanner;  // kullanıcıdan değer almamız için eklediğimiz scanner kütüphanesi 

public class Main {
     
    
    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in);  // kullanıcıdan değer almamıza yarayan scanner tanımlandı
        System.out.println("SPORCU SİSTEMİNE HOŞGELDİNİZ...");
        
        
        String islemler = "************GENEL İSLEMLER*************\n"// programımızda yer alan genel işlemler string olarak islemler adında tanımlandı 
                         +"1. işlem Güreş\n"
                         +"2. işlem Bilek Güreşi\n"
                         +"3. işlem Fitness\n"
                         +"Çıkış için q'a basınız";
        
        System.out.println(islemler);  //string olarak tanımlanan genel işlemler ekrana yazdırıldı
        System.out.println("**********************************");
        
        while (true) {
            
            System.out.print("Bir işlem seçiniz :");  // kullanıcıdan işlem girmesi ve alt satırda islem adına atanması sağlandı
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){  // çıkış yapılması için önce çıkış işlemi eklendi
                System.out.println("İşlemden çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){ // 1. işlem seçildikten sonra güresci sınıfı içeirisnde bulunan özellikler ekrana yazdırıldı
                
                Guresci idGuresci = new Guresci("Bilal", "TORTUM", 1.80 , 25, 93, "1.lik", "Pro lig");
                // yeni bir güreşci eklendi
                String guresmenu ="1.İşlem Bilgi getir...\n"
                                 +"2.İşlem Maça çık...\n"
                                 +"3.İşlem Antreman yap...\n"
                                 +"Çıkış için q'a basınız...";
                System.out.println("**********GURESCİ MENU*********************");
                System.out.println(guresmenu);
                System.out.println("*******************************************");
                
                while (true) {
                    
                    System.out.print("Bir işlem seçiniz : "); // while döngüsü içine alarak sürekli kullanıcıdan veri alarak bu tercihler sonrasında sürekli işlem yapılması sağlandı
                    String girdi =scanner.nextLine();
                    
                   
                    if (girdi.equals("q")){
                        System.out.println("İşlemlerden çıkılıyor...");
                        break;
                    }
                    else if (girdi.equals("1")){
                        idGuresci.bilgigetir1();
                    }
                    else if (girdi.equals("2")){
                        idGuresci.macacık();
                    }
                    else if (girdi.equals("3")){
                        idGuresci.antremanyap();
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    } 
                } 
            }
            else if (islem.equals("2")){ //diğer spor kategorisine erişim için 2. işlemler seçildiğinde bu kod blokları çalışmakta
                
                BilekGürescisi idBilekGuresci = new BilekGürescisi("Hamit", "ORTAN", 1.52, 23, 56, "YOK", "BRONZ lig", "SAĞ");
                //yeni bilek güreşi sporcusu tanımlandı
                String bguresmenu ="1.İşlem Bilgi getir...\n"
                                 +"2.İşlem Maça çık...\n"     // bilek güreşcisi kategorisinde bulunan işlemler ekrana yazdırıldı.
                                 +"Çıkış için q'a basınız...";
                System.out.println("*************BILEK GURESİ MENU************");
                System.out.println(bguresmenu);
                System.out.println("*******************************************");
                
                while (true) {
                    
                    System.out.print("Bir işlem seçiniz : ");
                    String girdi1 =scanner.nextLine();
                    
                   
                    if (girdi1.equals("q")){
                        System.out.println("İşlemlerden çıkılıyor...");
                        break;
                    }
                    else if (girdi1.equals("1")){
                        idBilekGuresci.bilgigetir();
                    }
                    else if (girdi1.equals("2")){
                        idBilekGuresci.macacık1();
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    } 
                }  
            }
            else if (islem.equals("3")){//diğer spor kategorisine erişim için 3. işlemler seçildiğinde bu kod blokları çalışmakta
                
                Fitness idFitness = new Fitness("Bilal", "TORTUM", 1.80, 25, 93, "1.lik", 41, 85, 135, 90, "BULK");
                
                String fitness ="1.İşlem Bilgi getir...\n"
                                 +"2.İşlem Bulk veya Cut\n"
                                 +"3.İşlem Kas Yap...\n"
                                 +"Çıkış için q'a basınız...";
                System.out.println("*************BILEK GURESİ MENU************");
                System.out.println(fitness);
                System.out.println("*******************************************");
                
                while (true) {
                    
                    System.out.print("Bir işlem seçiniz : ");
                    String girdi2 =scanner.nextLine();
                    
                   
                    if (girdi2.equals("q")){
                        System.out.println("İşlemlerden çıkılıyor...");
                        break;
                    }
                    else if (girdi2.equals("1")){
                        idFitness.bilgigetir();
                    }
                    else if (girdi2.equals("2")){
                        idFitness.bulkcut();
                    }
                    else if (girdi2.equals("3")){
                        idFitness.kasyap();
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    } 
                } 
            }
        }
    }
}
