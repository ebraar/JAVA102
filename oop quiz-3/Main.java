public class Main {
    public static void main(String[] args) {
        AkilliTelefon akilliTelefon1 = new AkilliTelefon(15);
        AkilliTelefon akilliTelefon2 = new AkilliTelefon(3);

        System.out.println("//////////////////////    1. telefon    //////////////////////////////");

        akilliTelefon1.ekranGoruntusuAl();
        akilliTelefon1.videoKaydet();
        akilliTelefon1.cagriSec();
        if(akilliTelefon1.piliKontrolEt(akilliTelefon1.pilDegeri)){
            System.out.println("Wifi aglari : ");
            for(int i =0; i< akilliTelefon1.wifiAglari.length; i++){
                akilliTelefon1.agaBaglan(akilliTelefon1.wifiAglari[i]);
            }
        } else {
            System.out.println("Pil yetersiz");
        }
        System.out.println("//////////////////////    2. telefon    //////////////////////////////");

        akilliTelefon2.dortKVideoKaydet();
        akilliTelefon2.numarayiAra("123456");

        if(akilliTelefon2.piliKontrolEt(akilliTelefon2.pilDegeri)){
            for (int i = 0; i < akilliTelefon2.wifiAglari.length; i++){
                System.out.println(akilliTelefon2.wifiAglari[i]);
            }
        } else {
            System.out.println("Pil yetersiz");
        }
    }
}