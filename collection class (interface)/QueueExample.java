import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // add() metodu ile kuyruğa öge ekleme
        // ekleme yapılmazsa hata verir.
        queue.add("Deniz");
        queue.add("Berna");
        // offer() metodu ile kuyruğa öğe ekleme
        // ekleme yapılmazsa false verir.
        queue.offer("Volkan");
        queue.offer("Çağlar");
        // remove() metodu kuyruğun başındaki değeri verir ve onu kuyruktan atar.
        // kuyruk boş ise java.util.NoSuchElementException hatasını verir.

        System.out.println("remove(): "+queue.remove());
        // element() metodu kuyruğun başındaki öğeyi verir, onu kuyruktan atmaz.
        // kuyruk boş ise java.util.NoSuchElementException hatasını verir.
        System.out.println("element(): "+queue.element());
        // poll() metodu kuyruğun başındaki öğeyi verir ve onu kuyruktan atar
        // kuyruk boş ise false değerini verir.
        System.out.println("poll(): "+queue.poll());
        // peek() metodu kuyruğun başındaki öğeyi verir, onu kuyruktan atmaz.
        // kuyruk boş ise false değerini verir.
        System.out.println("peek(): "+queue.peek());
    }
}
