public interface Wifi {
    String[] aglariBul();
    void agaBaglan(String agIsmi);

    default boolean piliKontrolEt(int deger){
        System.out.println("Pil degeri wifi icin: " + deger);
        if(deger > 10){
            return true;
        } else {
            return false;
        }
    }
}
