
public class Drayga extends Beyblade{
    
    private String kutsalCanavar;// bir beyblade class oluşturuldu ve Beyblade classı ile inheritance bağı kuruldu.

    public Drayga( String beybladeci, int donusHızı, int saldırıGucu,String kutsalCanavar) {
        super(beybladeci, donusHızı, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı: "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getBeybladeci()+""+kutsalCanavar+" ortaya çıkıyor");
        System.out.println(getBeybladeci()+"nın "+"saldırısı : Kapla Pençesi");
    }
    
    
}
