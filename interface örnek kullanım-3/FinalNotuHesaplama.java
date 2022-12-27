public class FinalNotuHesaplama implements IDortIslem{
    @Override
    public void toplama(){
        System.out.println("final notu toplandı.");
    }
    @Override
    public void cikarma(){
        System.out.println("final notu çıkarıldı.");
    }
    @Override
    public void carpma(){
        System.out.println("final notu çarpıldı.");
    }
    @Override
    public void bolme(){
        System.out.println("final notu bölündü.");
    }
}
