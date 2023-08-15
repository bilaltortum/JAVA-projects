
import java.util.Scanner;

public class ATMuygulaması 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000; // bakiye değişkenini oluşturduk ve 1000 değerini atadık.
        int tutar;
       
        String islemler ="1. İşlem : Bakiye sorgulama\n"
                        +"2. İşlem : Bakiye sorgulama\n"
                        +"3. İşlem : Bakiye sorgulama\n"
                        +"Çıkmak için 'Q' basınız...";
        System.out.println("****************************"); // islemler adında bir string değişkeni tanımladık ve ekrana yılzlar arasında çıktısını aldık.
        System.out.println(islemler);
        System.out.println("****************************");
        
        while (true)  // q ya basana kadar kullanıcıdan girdi alacak ve işlemleri while döngüsü içinde devam ettirecek.
        {            
            System.out.print("İşlem seçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")) // ilk olarak q a basınca programdan çıkması gerektiğini if komutu içerisine girdik.
            {
                System.out.println("Programdan çıkılıyor..");
                break;
            }
            else if(islem.equals("1")) // 1 e basılırsa bakiyemiz ekrana yazdırılmakta.
            {
                System.out.println("Bakiyeniz : " + bakiye);
            }
             else if(islem.equals("2")) // 2 ye basılırsa ekrana tutar sorusu gelecek daha sonra eğer tutar bakiyeden büyük olursa uyarı verecek değilse bakiyeden tutar düşecek ve yeni bakiye ekrana yazılacak. 
            {
                System.out.print("Ne kadar para çekmek istiyorsunuz : ");
                tutar = scanner.nextInt();
                scanner.nextLine();
                    if(bakiye - tutar < 0)
                        {
                            System.out.println("Yeterli bakiyeniz yok. Bakiyeniz = "+ bakiye);
                         }
                    else{
                             bakiye -=tutar;
                            System.out.println("Yeni bakiyeniz = "+ bakiye);
                        }
            }
             else if (islem.equals("3")) // 3 e baılırsa kullanıcıdan ne kadar para yatıracağı sorulup girilen değeri bakiye ile toplayarak ekrana çıktı sağlanacaktır.
            {
                   System.out.print("Ne kadar para yatıracaksınız : ");
                   int geldi = scanner.nextInt();
                   scanner.nextLine();   
                   bakiye += geldi;
                   System.out.println("Güncel bakiyeniz : "+ bakiye);  
            }
             else  // 1,2,3 haricinde bir giriş olursa geçersiz işlem çıktısı ekrana yazacaktır. 
             {
                 System.out.println("Geçersiz işlem");
             }
        }
    }
}
