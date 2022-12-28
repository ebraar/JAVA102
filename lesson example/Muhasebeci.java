public class Muhasebeci {
    Kar[] karHesaplari;
    int hesapSayisi = 0;

    public Muhasebeci(){
        karHesaplari = new Kar[1];
    }

    public void musteriEkle(Magaza m){
        karHesaplari[hesapSayisi] = (Kar) m;
        karHesaplari[hesapSayisi].karYazdir();
        hesapSayisi++;
    }
}
