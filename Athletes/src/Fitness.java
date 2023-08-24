
import java.util.Scanner;

public class Fitness extends Sporcu{// inheritance edildi. 
    
    private int kol_cm;
    private int bacak_cm;
    private int gogus_cm;      //sporcunun ek özellikleri eklendi
    private int karın_cm;
    private String bulkOrCut;
    
    Scanner scanner=new Scanner(System.in);

    public Fitness( String ad, String soyad, double boy, int yas, int kilo, String basari,int kol_cm, int bacak_cm, int gogus_cm, int karın_cm, String bulkOrCut) {
        super(ad, soyad, boy, yas, kilo, basari);
        this.kol_cm = kol_cm;
        this.bacak_cm = bacak_cm;
        this.gogus_cm = gogus_cm;  // erişim sağlanması için constructur oluşturuldu.
        this.karın_cm = karın_cm;
        this.bulkOrCut = bulkOrCut;
    }
    
    public void kasyap(){  // farklı bölgeleri seçerek random sayı değerinde arttırıp azaltılmasını sağlayan kod blokları
        
        String bölge="1 numara  Bacak\n"
                    +"2 numara  Gögüs\n"
                    +"3 numara  Kol \n"
                    +"4 numara  Karın\n"
                    +"Çıkış için q'a basınız...";
        System.out.println("************************************************************");
        System.out.println(bölge);
        System.out.println("************************************************************");
        
        while (true) {            
            
            System.out.print("Hangi bölgenin antremanını yapacaksınız:");
            String bölgesec=scanner.nextLine();
            
            double rnd =Math.random()*5;
            if(bölgesec.equals("q")){
                System.out.println("Çıkılıyor...");
                break;
            }
            else if(bölgesec.equals("1")){
                
                
                bacak_cm += (int)rnd;
                System.out.println("Bacağınız '"+(int)rnd+"'cm kadar kalınlaştı. Güncel bacak kalınlığı: "+bacak_cm);
                
            }
            else if(bölgesec.equals("2")){
                
                gogus_cm += (int)rnd;
                System.out.println("Gögüsünüz '"+(int)rnd+"'cm kadar kalınlaştı. Güncel gögüs kalınlığı: "+gogus_cm);
                
            }
            else if(bölgesec.equals("3")){
                
                kol_cm +=(int)rnd;
                System.out.println("Kolunuz '"+(int)rnd+"'cm kadar kalınlaştı. Güncel kol kalınlığı: "+kol_cm);
                
            }
            else if(bölgesec.equals("4")){
                
                karın_cm +=(int)rnd;
                System.out.println("Karın bölgeniz '"+(int)rnd+"'cm kadar inceldi. Güncel karın bölgeniz: "+karın_cm);
                
            }
            else{
                System.out.println("Geçersiz işlemm...");
            }
        }  
    }
    
    public void bulkcut(){

        while (true) {   
            
            String islem="1. islem BULK\n"
                        +"2. islem CUT\n"
                        +"Çıkmak için q'a basınız... ";
            
            System.out.println("**********************************");
            System.out.println(islem);
            System.out.println("**********************************");
            System.out.print("BULK mu CUT mı dönemine gireceksiniz: ");
            String girdi=scanner.nextLine();
           
            if(girdi.equals("q")){
                System.out.println("İşlemden çıkılıyor...");
                break;
            }
            else if (girdi.equals("BULK")) {
                
                double a = Math.random()*10;
                
                kol_cm += (int)a;
                bacak_cm += (int)a;
                gogus_cm += (int)a;
                karın_cm += (int)a;
                
                System.out.println("Bulk döneminde her bölgenize '"+(int)a+"' cm aldınız.");
                System.out.println("Güncel ölçüleriniz : KOL :"+kol_cm+
                                    "  BACAK :"+bacak_cm+
                                    "  GÖGÜS :"+gogus_cm+
                                    "  KARIN :"+karın_cm);
            }
            else if (girdi.equals("CUT")){
               
                double b = Math.random()*10;
                
                kol_cm -= (int)b;
                bacak_cm -= (int)b;
                gogus_cm -= (int)b;
                karın_cm -=(int)b;
                
                System.out.println("Cut döneminde her bölgenizden '"+(int)b+"' cm inceldiniz.");
                System.out.println("Güncel ölçüleriniz  KOL :"+kol_cm+
                                    "  BACAK :"+bacak_cm+
                                    "  GÖGÜS :"+gogus_cm+
                                    "  KARIN :"+karın_cm);
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
            
        }
        
    }
    
    public void bilgigetir(){
        super.bilgiGetir();
        System.out.println("Sporcunun kolu:"+kol_cm+"cm Sporcunun bacağı:"+bacak_cm+"cm Sporcunun Göğüsü:"+gogus_cm+"cm Sporcunun Beli:"+karın_cm+"cm");
    }
    }
