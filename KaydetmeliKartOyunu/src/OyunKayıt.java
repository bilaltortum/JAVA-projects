
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OyunKayıt {
    
    public static void oyunKaydet(Kart[][] kartlar){ // 2 boyutlu array imizi buraya gönderiyoruz
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){
            
            System.out.println("Oyun kaydediliyor...");
            out.writeObject(kartlar);  // kartları "kayit.bin" dosyası içerisine yazıyor.
            
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Kart[][] kayitAl(){  // Geri döndüren metod. iki boyutlu array döndürecek
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
            
            
            Kart[][] cikti = (Kart[][])in.readObject(); // 2d array referansı oluşturuyoruz (okumamızı kart referansına çeviriyoruz)
            
            return  cikti;
            
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
