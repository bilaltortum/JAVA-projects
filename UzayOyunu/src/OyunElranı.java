
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class OyunElranı extends JFrame{
    public OyunElranı(String title) throws HeadlessException {
        super(title);
    }
    public static void main(String[] args) {
        
        OyunElranı ekran = new OyunElranı("Uzay Oyunu");
        ekran.setResizable(false); // Oyun ekran oranı değiştirilmesin
        ekran.setFocusable(false); // Tüm işlemleri Jpannel üzerinde olmasını istiyoruz o yüzden FALSE
        
        ekran.setSize(800,600); // ekran boyutunu ayarlamaya yarıyor
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        
        oyun.requestFocus();//klavye girdilerini algılaması için
        
        oyun.addKeyListener(oyun); // oyunda iken girilen klavye girdilerini alıyor
        oyun.setFocusable(true); // odak JPannel
        
        oyun.setFocusTraversalKeysEnabled(false);
        
        
        ekran.add(oyun); // ekrana ekliyoruz
        
        ekran.setVisible(true);
        
        
        
        
    }

    
}
