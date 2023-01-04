public class AkilliTelefon extends CepTelefonu implements Kamera,Wifi{

    int pilDegeri;

    AkilliTelefon(int pilDegeri){
        this.pilDegeri = pilDegeri;
    }

    String[] wifiAglari = {"Harry","Prashanth", "Anjali5G"};

    @Override
    public void ekranGoruntusuAl(){
        System.out.println("ekran görüntüsü alındı.");
    }

    @Override
    public void videoKaydet(){
        System.out.println("video kaydedeiliyor.");
    }

    @Override
    public void dortKVideoKaydet(){
        Kamera.super.dortKVideoKaydet();
    }

    @Override
    public String[] aglariBul(){
        System.out.println("wifi ağları listeleniyor.");
        return wifiAglari;
    }

    @Override
    public void agaBaglan(String agIsmi){
        System.out.println("ağa bağlanılıyor: "+agIsmi);
    }

    @Override
    public boolean piliKontrolEt(int deger){
        return Kamera.super.piliKontrolEt(deger);
    }
}
