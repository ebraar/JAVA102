public interface Kar {
    default int karHesapla(int gelir, int gider){
        int sonuc = gelir-gider;
        return sonuc;
    }
    default int karMarji(int gelir, int gider) throws ArithmeticException{
        int kar = gelir - gider;
        if(kar==0){
            throw new ArithmeticException("Kar sıfır çıktı!");
        }
        int ara_sonuc = gelir/kar;
        int sonuc = ara_sonuc*100;
        return sonuc;
    }
    public abstract void karYazdir();
}
