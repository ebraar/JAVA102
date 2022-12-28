public class Gida extends Magaza implements IseAlma{
    public Gida(String magazaAdi, int gelir, int gider){
        super(magazaAdi, gelir, gider);
    }
    @Override
    public void karYazdir(){
        System.out.println(magazaAdi + " kar: "+karHesapla(gelir,gider)+ " kar marjı: "+karMarji(gelir, gider));
    }
    @Override
    public void uzmanIsIlani(){
        System.out.println("Gıda mühendisi işe alındı.");
    }
}
