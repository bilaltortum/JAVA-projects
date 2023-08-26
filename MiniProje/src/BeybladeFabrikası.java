
public class BeybladeFabrikası {
    public Beyblade beybladeUret(String beyblade_turu){  // burada bir beyblade fabrikası kuruldu buradaki amaç kullanıcının isteği doğrultusunda beyblade oluşturmaya yarayan metod kullanıldı.
        
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
        }
        else if(beyblade_turu.equals("Dranza")){
            return new  Dranza("Kai", 600, 600, "Kırmızı Anka Kuşu");
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
        }
        else if(beyblade_turu.equals("Draciel")){
            return new  Draciel("Max", 400, 1000, "Kara Kaplumbağa");
        }
        else{
            return null;
        }
    }
}
