import java.util.Arrays;
import java.util.Scanner;

public class Arrays {
    
    public static int[] doldur(int girdi){  // Bir dizi oluşturularak bu diziyi kullanıcıdan alının veriler ile dolduran metod
        Scanner scanner = new Scanner(System.in);
        int cikti [] = new int[girdi];
        for (int i = 0 ; i < girdi ;i++) { // for döngüsü ile kullanıcının girdiği sayıda oluşturulan dizinin her biri için kullanıcıdan veri alınarak dizi içerisine atanmakta
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }
    public static void bastir(int[] array) { // girilen değerleri ekrana yazdırmaya yarayan metod
        for(int i = 0; i < array.length;i++) {
            System.out.println("Dizi " + (i+1) + ": " + array[i]);
        }
    }
    public static void sirala(int [] array) {  // Arrays.sort kullanılarak girilen sayılar sıralandı
        System.out.println("******************************");
        Arrays.sort(array);
        bastir(array);
    }
    public static void main(String[] args) {
        int a [] = doldur(5);
        bastir(a);  // tanımladığımız metodları main içerisinde oluşturduk
        sirala(a);
        
    }
}
