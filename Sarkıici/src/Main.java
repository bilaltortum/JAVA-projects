
import java.util.Scanner;

public class Main {
    
    private static Sarkicilar sarkicilar = new Sarkicilar(); // Başka bir objeyi bu class içerisine aldık (Composition)
    private static Scanner scanner = new Scanner(System.in);
    
    public static void sarkici_bastir(){
        System.out.println("\t  0 - İşlemleri tekrar göster\n"
                            +"\t  1 - Şarkıcı göster\n"
                            +"\t  2 - Şarkıcı ekle\n"
                            +"\t  3 - Şarkıcı güncelle\n"
                            +"\t  4 - Şarkıcı sil\n"
                            +"\t  5 - Şarkıcı ara\n"
                            +"\t  6 - Uygulamadan çık");
    }
    
    public static void görüntüle(){
        sarkicilar.cikti();
    }
    public static void ekle(){
        System.out.print("Eklemek istediğiniz şarkıcı adı :");
        String deger = scanner.nextLine();
        sarkicilar.ekle(deger);
    }
    public static void güncelle(){
        System.out.print("Güncellemek istediğiniz poziyonu giriniz (1, 2, 3...) ");
        int deger = scanner.nextInt();
        scanner.nextLine();
        String yeniIsim= scanner.nextLine();
        sarkicilar.güncelle(yeniIsim, deger-1);
    }
    public static void sil(){
        System.out.print("Silmek istediğiniz poziyonu giriniz (1, 2, 3...) ");
        int deger = scanner.nextInt();
        sarkicilar.sil(deger);
    }
    public static void ara(){
        System.out.print("Aramak istediğiniz şarkıcıyı giriniz :) ");
        String deger = scanner.nextLine();
        sarkicilar.ara(deger);
    }
    public static void main(String[] args) {
       
        System.out.println(" Şarkıcı Uygulamasına Hoşgeldiniz...");
        sarkici_bastir();
        boolean cikis =false;
        int girdi;
        
        while(!cikis){
            System.out.print("Bir işlem seçiniz :");
            
            girdi = scanner.nextInt();
            scanner.nextLine();
            
            switch (girdi) {
                case 0:
                    sarkici_bastir();
                    break;
                case 1:
                    görüntüle();
                     break;
                case 2:
                    ekle();
                    break;
                case 3:
                    güncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor");
                    break;
            }
                
            }
        }
    }

