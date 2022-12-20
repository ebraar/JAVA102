import java.util.*;

public class ArrayList {
    public static void main(String[] args) {

        // string tipinde elemanları tutan ArrayList initialize
        List<String> nameList = new java.util.ArrayList<String>();

        //indis 0'dan başlayarak elemanları sırayla yerleştirir.
        nameList.add("Gamze");
        nameList.add("Elif");
        nameList.add("Mustafa");
        nameList.add("Umut");
        nameList.add("Umut");
        //ArrayList null değerli eleman tutabilir.
        nameList.add(null);

        //tüm listeyi ekrana yazdırır.
        System.out.println(nameList);

        //size() metodu, Collection Interface'inden gelen bir mirastır.
        System.out.println("Size of List: "+nameList.size());

        //get ile listeden eleman okuması yapılır. okunan eleman listeden çıkartılmaz.
        System.out.println("Element of 1 index: "+nameList.get(1));
        System.out.println("Element of 2 index: "+nameList.get(2));

        //liste başından taramaya başlayarak ilk geçen noktadaki umut bilgisinin indis değerini verir.
        System.out.println("Index of 'umut': "+nameList.indexOf("Umut"));

        //liste sonundan taramaya başlayarak son geçen noktadaki umut bilgisinin indis değerini verir.
        System.out.println("Index of 'umut': "+nameList.lastIndexOf("Umut"));

        //add() fonksiyonuna ilk verilen argüman indis, sonra elemandır.
        //verilen indise gidip verilen elemanı koyar.
        //verilen indiste daha önceden tanımlanmış değer varsa, fonksiyondaki
        //elemanı o indise koyar ve geri kalan elemanları kaydırır.
        nameList.add(3, "Zeynep");

        //set() fonksiyonuna ilk verilen argüman indis, sonraki elemandır.
        //verilen indise gidip verilen elemanı koyar.
        //verilen indis, liste boyutunun dışında olmamalıdır.
        nameList.set(1, "Naz");

        //contains ile liste içinde aradığımız eleman var mı yok mu belirtir.
        //varsa true, yoksa false döner.
        System.out.println(nameList.contains("Elif"));
        System.out.println(nameList.contains("Mustafa"));

        //remove fonksiyonu ile listeden belirttiğimiz indisteki değer silinir.
        //silinen değer fonksiyondan bize geri döndürülür.
        String firstElement = nameList.remove(0);
        System.out.println(firstElement + " is removed from list!");

        List<String> newNameList = new java.util.ArrayList<String>();
        newNameList.add("Batuhan");
        newNameList.add("Kemal");

        //bir listeyi tümüyle bir diğer listeye eklemek için "addAll" fonksiyonu kullanılır.
        nameList.addAll(newNameList);

        //listeden alt bir liste oluşturmak için "sublist" fonksiyonu kullanırız.
        //başlangıç ve bitiş indisleri verilir.
        //başlangıç indisindeki eleman dahil, bitiş indisindeki eleman hariç
        //yeni bir liste oluşturulur.

        List<String> subList = nameList.subList(4,6);
        System.out.println("Sublist from name list");
        System.out.println(subList);

        //toArray fonksiyonu parametresiz çağırırsanız Object tipinde bir dizi döner.

        Object[] objectArray = nameList.toArray();

        //toArray fonksiyonuna hangi tipte bir dizi oluşturmak istiyorsak,
        //o tipten bir nesne üretip parametre olarak göndeririz.
        //string tipinden bir dizi almak istediğimiz için "new String[0]" şeklinde
        //bir nesne üretip, "toArray" fonksiyonuna gönderdik.

         String[] stringArray = nameList.toArray(new String[0]);

         //listedeki tüm elemanları temizler. yami tümünü listeden siler.
        nameList.clear();


    }

}
