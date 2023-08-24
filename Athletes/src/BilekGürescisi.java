
import java.util.Random;

public class BilekGürescisi extends Guresci{ // inheritance edildi. Dolaylı olarak sporcu sınıfından da özellikler gledi
    
    private String sagsol;

    public BilekGürescisi(String ad, String soyad, double boy, int yas, int kilo, String basari, String kategori,String sagsol) {
        super(ad, soyad, boy, yas, kilo, basari, kategori);
        this.sagsol=sagsol;  // bilek güreşcilerinin ek özellikleri tanımlandı
    }
    
        
    
    public void macacık1(){ // random sayı üretilerek maça çıkarak ekrana dönüt veren kod satırları
        
        Random random1= new Random();
        int b=random1.nextInt(2)+1;
        
        if(b==1){
            System.out.println("Tebrikler maçı kazandınız...");
        }
        else{
            System.out.println("Maçı kaybettiniz...");
        }
    }
    
    public void bilgigetir(){ //  bilgileri getirmeye yarayan kod satırları super ile sporcu sınıfından getirilmekte ek olarak bilek güreşcisinin özelliği eklendi
        super.bilgiGetir();
        System.out.println("Sporcunun tercihi :"+sagsol);
}
}

