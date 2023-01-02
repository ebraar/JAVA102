public class Kopek extends Hayvan implements EvcilHayvan{
    String isim;

    public Kopek(String isim, int ayakSayisi){
        super(4);
        this.isim = isim;
    }
    @Override
    public void yuru(){
        System.out.println("köpek yürüyo..");
    }

    @Override
    public void yemekYe(){
        System.out.println("köpek yemek yiyo..");
    }

    @Override
    public void setIsim(String isim){
        this.isim = isim;
    }

    @Override
    public String getIsim(){
        return this.isim;
    }

    @Override
    public void oyunOynat(){
        System.out.println("köpek oyun oynuyor..");
    }
}
