class DortIslemManager{
    public void toplama(IDortIslem idi){
        idi.toplam();
    }
    public void cikarma(IDortIslem idi){
        idi.cikarma();
    }
    public void carpma(IDortIslem idi){
        idi.carpma();
    }
    public void bolme(IDortIslem idi){
        idi.bolme();
    }
}
public class Main {
    public static void main(String[] args) {
        DortIslemManager dim = new DortIslemManager();
        dim.toplama(new VizeNotuHesaplama());
        dim.toplama(new FinalNotuHesaplama());
    }
}
