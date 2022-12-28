public abstract class Magaza implements Kar{
    String magazaAdi;
    int gelir;
    int gider;

    public Magaza(String magazaAdi, int gelir, int gider){
        this.magazaAdi = magazaAdi;
        this.gelir = gelir;
        this.gider = gider;
    }
}
