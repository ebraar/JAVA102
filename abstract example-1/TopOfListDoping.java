public class TopOfListDoping extends Doping{

    public TopOfListDoping(double price) {
        super.setPrice(price);
    }

    //"doping" soyut sınıfınan kalıtımla gelen, calculate isimli soyut metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
    // "topoflist" isimli doping tipinde vergiler olmadığı için komisyon oranı eklenip ücret hesaplanıyor. fakat başka doping çeşitlerinde hesaplama farklı olabilir.

    @Override
    public double calculate(){
        return super.getPrice() + super.getPrice()*0.35;
    }
}
