
import java.util.Scanner;

public class hesapmakinesi 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);  // kullanıcıdan veri alınması için scanner tanımlandı
        int a;  
        int b;
     
        
        String islemler ="1. Toplama\n"+
                         "2. Çıkarma\n"+
                         "3. Çarpma\n"+
                         "4. Bölme\n";  // yapılacak işlemlerimizi ekrana yazdırmak için islemler adında bir string tanımlandı.
        
        System.out.println("***************************");
        System.out.print("İşlemler \n"+ islemler);      // göze hoş gözükmesi için  yıldız arasına işlemler yazdırıldı.
        System.out.println("***************************");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        String islem =scanner.nextLine(); // kullanııcıdan alınan veri islem olarak atandı.
        
        switch(islem)  //  kullanıcıdan gelen "islem" değerine göre case lere yönlendirildi.
        {
                case "1" ->  // kullanıcıdan iki sayı alarak ekrana toplamını yazdırılması sağlandı.
                {
                    System.out.print("1. sayı : ");
                    a=scanner.nextInt();
                    System.out.print("2. sayı : ");
                    b=scanner.nextInt();
                    System.out.println("Toplam : " + (a+b));
                }
                case "2" ->  // kullanıcıdan iki sayının büyük olandan küçük olanı çıkartmak için if else kullanıldı ve ekrana sayıların farkları yazdırıldı.
                {
                    System.out.print("1. sayı : ");
                    a=scanner.nextInt();
                    System.out.print("2. sayı : ");
                    b=scanner.nextInt();
                   if(a>b)
                   {
                       System.out.println("Fark : "+ (a-b) );
                   }
                   else
                   {
                       System.out.println("Fark : "+ (b-a) );
                   }
                }
                case "3" -> // kullanıcıdan iki sayı alarak ekrana çarpımının yazdırılması sağlandı.
                {
                    System.out.print("1. sayı : ");
                    a=scanner.nextInt();
                    System.out.print("2. sayı : ");
                    b=scanner.nextInt();
                    System.out.println("Çarpımları : " + (a*b));
                }
                case "4" -> // kullanıcıdan iki sayının büyük olandan küçük olana bölmek için if else kullanıldı ve ekrana sayıların farkları dobule olarak (virgül kısmının görülmesi için) yazdırıldı.

                {
                    System.out.print("1. sayı : ");
                    a=scanner.nextInt();
                    System.out.print("2. sayı : ");
                    b=scanner.nextInt();
                     if(a>b)
                   {
                       System.out.println("Fark : "+ ((double)a/b) );
                   }
                   else
                   {
                       System.out.println("Fark : "+ ((double)b/a) );
                   }
                }
                default ->  // 1,2,3,4 harici bir sayı girildiğinde ise buradaki çıktı ekrana çıkmakta.
                {
                    System.out.println("Lütfen geçerli işlem seçiniz...");
                }
        }
    }
}
