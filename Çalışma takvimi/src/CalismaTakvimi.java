public class CalismaTakvimi 
{
    public static void main(String[] args) {
        
        for(int i =1; i<=60;i++){
            for(int k=1;i<=60;i++){
                if (i ==1){
                    System.out.print("\t"+i+". Çalışma günü : ");
                    System.out.println((i)+" .gün   ");
                }
                else if (i ==2){
                    System.out.print("\t"+i+". Çalışma günü : ");
                    System.out.println((i-1)+" .gün  "+(i)+" .gün   ");
                }
                else if (i ==3){
                    System.out.print("\t"+i+". Çalışma günü : ");
                   System.out.println((i-2)+" .gün  "+(i-1)+" .gün   "+(i)+" .gün   "); 
                }
                else if (i ==4){
                   System.out.print("\t"+i+". Çalışma günü : ");
                   System.out.println((i-3)+" .gün  "+(i-2)+" .gün   "+(i-1)+" .gün   "+(i)+" .gün   ");
                }
                else if(i>4){
                
                System.out.print("\t"+i+". Çalışma günü : ");
                System.out.println((i-3)+" .gün  "+(i-2)+" .gün   "+(i-1)+" .gün   "+(i)+" .gün   ");
                if(i%7==0){System.out.println("\nKelimleri kart haline çevir...\n");}
                }
            }
        }
    }
}  

       


