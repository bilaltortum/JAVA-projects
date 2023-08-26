
public class Dragon extends Beyblade{
    private  String kutsalCanavar;
    private  String gizliYetenek;// bir beyblade class oluşturuldu ve Beyblade classı ile inheritance bağı kuruldu.
    // Ekstra olarak bir gizli yetenek eklendi 

    public Dragon(String beybladeci, int donusHızı, int saldırıGucu,String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHızı, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı: "+kutsalCanavar);
        System.out.println("Gizli yetenek: "+gizliYetenek);

    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getBeybladeci()+""+kutsalCanavar+" ortaya çıkıyor");
        System.out.println(getBeybladeci()+"nın saldırısı : Hayalet kasırgası");    
    }
}
