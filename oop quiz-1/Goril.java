public class Goril extends Hayvan{
    String isim;

    public Goril(int ayakSayisi, String isim){
        super(ayakSayisi);
        this.isim = isim;
    }
    @Override
    public void yuru(){
        System.out.println("goril yürüyo..");
    }
    @Override
    public void yemekYe(){
        System.out.println("goril muz yiyo..");
    }
}
