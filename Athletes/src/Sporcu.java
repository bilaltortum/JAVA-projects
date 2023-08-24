public class Sporcu {
    
    private String ad;
    private String soyad;
    private double boy;          // tüm sporcularda bulunan temel özellikler
    private int yas;
    private int kilo;
    private String basari;

    public Sporcu(String ad, String soyad, double boy, int yas, int kilo, String basari) {
        this.ad = ad;
        this.soyad = soyad;
        this.boy = boy;
        this.yas = yas;        // erişim sağlanması için constructur oluşturuldu.
        this.kilo = kilo;
        this.basari = basari;
    }

    public void bilgiGetir(){
        System.out.println("Sporcu Adı :" +ad);
        System.out.println("Sporcu Soyadı :"+soyad);
        System.out.println("Sporcu Yaşı :" +yas);           //sporcuların bilgilerini getirtmeye yarayan kod bloklarımız.
        System.out.println("Sporcu Boyu :"+boy);
        System.out.println("Sporcu Kilosu :"+kilo);
        System.out.println("Sporcu Başarıları :"+basari);
    } 
    
    public String getAd() {   //getter ve setterlar yazıldı.
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getBasari() {
        return basari;
    }

    public void setBasari(String basari) {
        this.basari = basari;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
