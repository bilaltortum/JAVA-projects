public class Ucgen extends Sekil{
    
    private  int ilk;
    private  int ikinci;
    private  int ücüncü;

    public Ucgen(String isim,int ilk,int ikinci,int ücüncü) {
        super(isim);
        
        this.ilk = ilk;
        this.ikinci = ikinci;
        this.ücüncü = ücüncü;
    }

    @Override
    public void alanHesap() {
        double u = (ilk + ikinci+ ücüncü)/2.0;
        double alan =Math.sqrt(u*(u-ilk)*(u-ikinci)*(u-ücüncü));
        System.out.println(getIsim()+"Alanı :"+ alan);
    }
    
}
