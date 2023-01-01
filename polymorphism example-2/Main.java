public class Main {

    public static void konustur(Object object){

        if(object instanceof Kopek){
            Kopek kopekTest = (Kopek)object;
            System.out.println(kopekTest.konus());
        }
        else if(object instanceof Kedi){
            Kedi kediTest = (Kedi)object;
            System.out.println(kediTest.konus());
        }
        else if (object instanceof At){
            At atTest = (At)object;
            System.out.println(atTest.konus());
        }
        else if (object instanceof Hayvan){
            Hayvan hayvanTest = (Hayvan)object;
            System.out.println(hayvanTest.konus());
        }
    }
    public static void main(String[] args) {

        //temel gösterim:
        Kedi kedi = new Kedi("nasip");

        if(kedi instanceof Kedi){
            System.out.println("bu nesne kedi sınıfından");
        }

        //bir nesnenin hangi sınıfa ait olduğunu çalışma anında
        //tespit etmek için instanceof operatörünü kullanabiliriz.
        //bu operatör iki değer alır: sol tarafına bir nesne
        //ve sağ tarafına ise bir sınıf değeri alır.
        // eğer belirtilen nesne belirtilen sınıf ait ise true
        //değil ise false değerini döndürür. örnek;

        /*
        Canli canli = new Canli();
        sout(canli instanceof Canli);
        sout(canli instanceof Araba);

        ekran çıktısı: true ve false olur.
        */

        if(kedi instanceof Hayvan){
            System.out.println("bu nesne hayvan sınıfından");
        }

        // fonksiyon ile gösterim

        Kedi cat = new Kedi("Nasip");
        Kopek kopek = new Kopek("Zizu");
        At at = new At("BoldPilot");
        Hayvan hayvan = new Hayvan("Turunç");

        konustur(cat);
        konustur(kopek);
        konustur(at);
        konustur(hayvan);

    }
}
