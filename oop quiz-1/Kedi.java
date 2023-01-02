public class Kedi implements EvcilHayvan{
    public String isim;

    public Kedi(String isim){
        this.isim = isim;
    }

    public void yuru(){
        System.out.println("kedi yürüyo..");
    }

    public void yemekYe(){
        System.out.println("kedi kesmek yemek istiyor..");
    }

    @Override
    public void setIsim(String isim){
        this.isim = isim;
    }

    @Override
    public void oyunOynat(){
        System.out.println("kedi oyun oynamak istiyor..");
    }

    @Override
    public String getIsim(){
        return this.isim;
    }
}
