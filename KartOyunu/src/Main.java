
import java.util.Scanner;

public class Main {
    private static Kart[][] kart = new Kart[4][4];
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        kart[0][0] = new Kart('E');
        kart[0][1] = new Kart('A');
        kart[0][2] = new Kart('B');
        kart[0][3] = new Kart('E');
        kart[1][0] = new Kart('G');
        kart[1][1] = new Kart('A');
        kart[1][2] = new Kart('F');
        kart[1][3] = new Kart('G');
        kart[2][0] = new Kart('E');
        kart[2][1] = new Kart('D');
        kart[2][2] = new Kart('B');
        kart[2][3] = new Kart('H');
        kart[3][0] = new Kart('E');
        kart[3][1] = new Kart('G');
        kart[3][2] = new Kart('B');
        kart[3][3] = new Kart('C');
        
        while (oyunBitti() == false) {            
            oyunAlani();
            tahminEd();
        }
        
    }
    
    public static void  tahminEd(){
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("İlk tahmininizi giriniz. (tahmin arasında boşluk olsun)");
        int i1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        
        kart[i1][k1].setTahmin_et(true);
        oyunAlani();
        
        System.out.println("İkinci tahmininizi giriniz. (tahmin arasında boşluk olsun)");
        int i2 = scanner.nextInt();
        int k2 = scanner.nextInt();
        
        if(kart[i1][k1].getDeger() == kart[i2][k2].getDeger()){
            System.out.println("Doğru tahmin");
            kart[i2][k2].setTahmin_et(true);
        }
        else{
            
            System.out.println("Bilemediniz");
            kart[i1][k1].setTahmin_et(false);
        }
    }
    
    public static boolean oyunBitti(){
        for (int i =0;i<4;i++){
            for (int k=0;k<4;k++){
                if(kart[i][k].isTahmin_et() == false){
                    return  false;
                 }
            }
        }
        return false;
    }
    
   public static void oyunAlani(){
        for (int i =0;i<4;i++){
            System.out.println("********************");
            for (int k=0;k<4;k++){
                if (kart[i][k].isTahmin_et()){
                    System.out.print("  |"+kart[i][k].getDeger()+"|  ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
            System.out.println("********************");
    }
    
}

