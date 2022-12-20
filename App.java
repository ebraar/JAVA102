import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {



        Book kitap1 = new Book("İnsan Neyle Yaşar",96,"Tolstoy",1885);
        Book kitap2 = new Book("Cocukluk",1852,"Tolstoy",162);
        Book kitap3 = new Book("Sırça Köşk",1947,"Sabahattin Ali",141);
        Book kitap4 = new Book("Beyin",2015,"David Eagleman",275);
        Book kitap5 = new Book("Homo Deus",2015,"Yuval Noah Harari",448);


        TreeSet<Book> books = new TreeSet<Book>();

        books.add(kitap1);
        books.add(kitap2);
        books.add(kitap3);
        books.add(kitap4);
        books.add(kitap5);

        for (Book book : books){
            System.out.println(String.format("Kitap adı : %s \t Sayfa sayısı : %s \t Yazar : %s \t Yayım tarihi : %s",book.getName(),book.getPageNum(),book.getWriterName(),book.getPublishDate()));
        }


        System.out.println("#######################################");

        TreeSet<Book> book = new TreeSet<Book>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }

        });

        book.add(kitap1);
        book.add(kitap2);
        book.add(kitap3);
        book.add(kitap4);
        book.add(kitap5);

        for(Book kitap : book){
            System.out.println(String.format("Kitap adı : %s \t Sayfa sayısı : %s \t Yazar : %s \t Yayım tarihi : %s",kitap.getName(),kitap.getPageNum(),kitap.getWriterName(),kitap.getPublishDate()));
        };

    }
}