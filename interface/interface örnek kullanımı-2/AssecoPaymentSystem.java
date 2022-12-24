public class AssecoPaymentSystem implements PaymentProvider{
    @Override
    public boolean cancelCharge(int chargeId){
        return false;
    }

    @Override
    public int charge(double totalPrice){
        return 0;
    }

    @Override
    public String loadInvoice(int chargeId){
        return null;
    }
}
