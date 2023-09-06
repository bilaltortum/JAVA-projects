
import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_liste = new ArrayList<String>();
    
    public void cikti(){
        System.out.println("Şarkıcı Listesinde " + sarkici_liste.size() + " adet şarkıcı var");
        
        for (int i=0; i<sarkici_liste.size(); i++){
            System.out.println((i+1) + ". Şarkıcı :"+sarkici_liste.get(i));
        }
    }
    public void ekle(String isim){
        sarkici_liste.add(isim);
        System.out.println("Şarkıcı Listesi Güncellendi..");
    }
    public void güncelle(String yeniIsim,int indeks){
        sarkici_liste.set(indeks, yeniIsim);
        System.out.println("Şarkıcı Listesi Güncellendi..");
    }
    public void sil(int indeks){
        String isim = sarkici_liste.get(indeks);
        sarkici_liste.remove(indeks);
        System.out.println(isim + " İsimli şarkıcı listeden silindi..");
    }
    public void ara(String sarkici_isim){
        int index = sarkici_liste.indexOf(sarkici_isim);
        if(index >= 0){
            System.out.println("Şarkıcı Bulundu");
            System.out.println(sarkici_isim+" İsimli şarkıcı "+(index+1)+" pozisyonda");
        }
        else{
            System.out.println("Şarkıcı bulunamadı...");
        }
    }
}
