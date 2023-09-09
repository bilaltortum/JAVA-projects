
public class Daire extends Sekil{
    
    private  int yariCap;

    public Daire(String isim,int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    public void alanHesap() {
        System.out.println(getIsim()+ "'nin alanı: " + (Math.PI*(Math.sqrt(yariCap))));
    }
}
