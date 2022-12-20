import java.util.LinkedList;
import java.util.List;

public class LinkedL {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Çetindağ");
        liste.add("Mustafa");
        liste.add("Java");
        liste.add("102");

        liste.remove(2);

        for (String s : liste) {
            System.out.println(s);
        }
        for(String str : liste){
            System.out.println(str);
        }
    }
}
