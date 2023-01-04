public interface Kamera {

    void ekranGoruntusuAl();
    void videoKaydet();
    default void dortKVideoKaydet(){
        System.out.println("4K video kaydediliyor");
    }
    default boolean piliKontrolEt(int deger){
        System.out.println("Pil degeri kamera icin: " + deger);
        if(deger > 20){
            return true;
        } else {
            return false;
        }
    }
}
