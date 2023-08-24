
import java.util.Random;


public class Guresci extends Sporcu{ // inheritance edildi. 
    
    private String kategori;
            
    public Guresci(String ad, String soyad, double boy, int yas, int kilo, String basari,String kategori){
        super(ad, soyad, boy, yas, kilo, basari);
        this.kategori=kategori;    // sporcu sınıfındaki özelliklerin üzerine gürescilerin özellikleri de eklendi.
    }
    public void bilgigetir1(){
        super.bilgiGetir();
        System.out.println("Sporcunun kategorisi : HENÜZ BELLİ DEĞİL" );
    }  //  bilgileri getirmeye yarayan kod satırları super ile sporcu sınıfından getirilmekte ek olarak  güreşcinin özelliği eklendi
    
    public void macacık(){
        
        Random random= new Random();
        int i=random.nextInt(2)+1;
        
        if(i==1){
            System.out.println("Tebrikler maçı kazandınız...");
        }
        else{
            System.out.println("Maçı kaybettiniz...");
        }
    } //1 ve 2 sayılarını random üretilerek 1 gelirse maçı kazandığı 2 gelirse maçı kaybettiğini ekrana yazdıran kod sayırları
    
    int antsayi=2;
    public void antremanyap(){
        
            if (antsayi>0 && antsayi<=2) {
            antsayi = antsayi-1;
            System.out.println("Antreman yapıldı...(Kalan antreman sayısı:"+antsayi);
        } 
          else{
            System.out.println("Günlük antreman sayınız bitmiştir...");
        }   
    }  // sporcunun antreman yaptığı ve 2 hakkı olduğunu, hakkı dolduktan sonra geri dönüt aldığı kod satırları
    
}
