public class VizeNotuHesaplama implements IDortIslem{
    @Override
    public void toplama(){
        System.out.println("vize notu toplandı.");
    }
    @Override
    public void cikarma(){
        System.out.println("vize notu çıkartıldı.");
    }
    @Override
    public void carpma(){
        System.out.println("vize notu çarpıldı.");
    }
    @Override
    public void bolme(){
        System.out.println("vize notu bölündü.");
    }
}
