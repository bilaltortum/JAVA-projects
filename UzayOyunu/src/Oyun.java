
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Mermi {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Mermi(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class Oyun extends JPanel implements KeyListener,ActionListener{
    
    Timer timer = new Timer(1, this); 
    
    private int gecen_sure = 0;
    private  int ates_etme = 0;
    
    private  BufferedImage image; // uzay gemimizi bu sayde ekleyeceğiz 
    private  BufferedImage image2;
    private ArrayList<Mermi> mermi = new ArrayList<>();
    
    private int mermidirY = 1; // oluşan mermiler her actionperform oluştukça y de ileri gidecek
   
    private int topX = 0; // top sağa sola gidecek sadece 0 noktasından başlayacak
    
    private int topdirX = 2;
    
    private int gemiX = 0;
    
    private int diruzayX = 20;

    
    public boolean kontrolEt(){
        
        for(Mermi mermiler : mermi){
            
            if(new Rectangle(mermiler.getX(),mermiler.getY(),10,20).intersects(new Rectangle(topX,0,20,20))){
                return true;
            }
        }
        return false;
        
    }
    
    public Oyun() {
        try { 
            image = ImageIO.read(new FileImageInputStream(new File("uzayaracı.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            image2 = ImageIO.read(new FileImageInputStream(new File("uzay.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        timer.start(); 
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
   
       g.drawImage(image2, 0, 0,image2.getWidth()/1,image2.getHeight()/1, this);

    g.setColor(Color.RED);
    g.fillOval(topX, 0, 25, 25);    
    
    g.drawImage(image,gemiX,450,image.getWidth() /45,image.getHeight()/45,this );
    
    for (Mermi mermiler : mermi){
        if (mermiler.getY()<0) {
            mermi.remove(mermiler);
        }
    }
    
    g.setColor(Color.BLUE);
    for(Mermi mermiler : mermi){
        g.fillRect(mermiler.getX(), mermiler.getY(), 10, 20);
    }
    
    if(kontrolEt()){
        timer.stop();
        JOptionPane.showMessageDialog(this, "Harcanan mermi : "+ ates_etme + " Harcanan süre :"+ gecen_sure + "sn");
        System.exit(0);
    }
    
    }

    @Override
    public void repaint() {
        super.repaint(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
          
        int c =e.getKeyCode(); // sola basınca sola basıldı diye değer dönecek
        
        if(c == KeyEvent.VK_LEFT){
            if (gemiX <= 0){
                
                gemiX = 0;
            }
            else {
                gemiX -= diruzayX;
            }
        }
        else if (c == KeyEvent.VK_RIGHT){
            if (gemiX >= 720){
                gemiX = 720;
            }
            else{
                gemiX += diruzayX;
            }
        }
        
        else if (c == KeyEvent.VK_SPACE){
            mermi.add(new Mermi(gemiX+50,450));
            
            ates_etme++;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (Mermi mermiler : mermi){
            mermiler.setY(mermiler.getY()-mermidirY);
        }
        
        
        
        
        topX += topdirX;  // topun timer ile hareketini sağlayan kodumuz
        
        if (topX >= 750){
            topdirX = -topdirX;  // 750 gelince top geri dönecek
        }
        if (topX <=0 ) {
            topdirX = -topdirX;
        }
        repaint();
    }
    
    
    
    
}
