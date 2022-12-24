public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Account account = accountManager.login();
        System.out.println("Hoşgeldiniz " + account.getUser().getFname() + " " +
                account.getUser().getLname());
        account.addAddress("İnönü / Eskişehir");
        account.addAddress("Ayvacık / Çanakkale");
        account.addAddress("Çerkezköy / Tekirdağ");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();
    }
}
