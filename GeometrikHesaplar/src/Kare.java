
public class Kare extends  Sekil{
    
    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar= kenar;
    }

    @Override
    public void alanHesap() {
        System.out.println(getIsim() + "' ın alanı: "+ (kenar*kenar));
    }
}
