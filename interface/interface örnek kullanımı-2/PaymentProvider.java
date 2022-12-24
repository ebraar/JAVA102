//interface anahtar kelimesi ile bir interface tipi tanımlanır.

public interface PaymentProvider {
    // interface içinde yer alan fonksiyonların hepsi soyuttur.
    // bu soyut fonksiyonlar interface'den kalıtım alan alt sınıflarla doldurulu.

    boolean cancelCharge(int chargeId);
    int charge(double totalPrice);
    String loadInvoice(int chargeId);
}
