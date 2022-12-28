public class Giyim extends Magaza implements IseAlma{
    public Giyim(String magazaAdi, int gelir, int gider){
        super(magazaAdi,gelir,gider);
    }
    @Override
    public void karYazdir(){
        System.out.println(magazaAdi + " kar: "+karHesapla(gelir,gider)+ " kar marjı: "+karMarji(gelir, gider));
    }
    @Override
    public void uzmanIsIlani(){
        System.out.println("Modacı iş ilanı verildi.");
    }
}
