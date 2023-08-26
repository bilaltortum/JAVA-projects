public class Beyblade {
    private String beybladeci;
    private int donusHızı;   // Her beybladde olan özellikler oluşturuldu
    private int saldırıGucu;

    public Beyblade(String beybladeci, int donusHızı, int saldırıGucu) { //Constructor oluşturuldu
        this.beybladeci = beybladeci;
        this.donusHızı = donusHızı; // constructurlar eşitlendi
        this.saldırıGucu = saldırıGucu;
    }
    
    public void saldır(){  // Her beyblade nin bir saldırı gücü ve hızı olduğunu belirten metod oluştuurldu.
        System.out.println(beybladeci+""+saldırıGucu+" ve "+donusHızı+" ile saldırıyor.");
    }
    public void kutsalCanavarOrtayaCıkar(){ // Her beyblade nin kutsal canavarı olduğunu belirten metod oluştuurldu.
        System.out.println("Bu beyblade'nin kutsal canavarı bulunmamaktadır.");
    }
    public void bilgileriGoster(){  // Her beyblade nin özelliklerini getiren metod oluşturuldu
        System.out.println("Beybladeci ismi: "+beybladeci);
        System.out.println("Saldırı gücü: "+saldırıGucu);
        System.out.println("Dönüş hızı: "+donusHızı);
    }
    public String getBeybladeci() {  // Getter ve setterlar oluşturuldu.
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHızı() {
        return donusHızı;
    }

    public void setDonusHızı(int donusHızı) {
        this.donusHızı = donusHızı;
    }

    public int getSaldırıGucu() {
        return saldırıGucu;
    }

    public void setSaldırıGucu(int saldırıGucu) {
        this.saldırıGucu = saldırıGucu;
    }
    
}
