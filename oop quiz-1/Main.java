public class Main {
    public static void main(String[] args) {

        Kedi kedi = new Kedi("boncuk");

        System.out.println(kedi.getIsim());
        kedi.oyunOynat();
        kedi.yemekYe();
        kedi.yuru();

        Kopek kopek = new Kopek("karabaş",4);

        System.out.println("köpeğin ayak sayısı: "+kopek.ayakSayisi);
        kopek.oyunOynat();
        kopek.yemekYe();
        kopek.yuru();
        System.out.println(kopek.getIsim());
    }
}
