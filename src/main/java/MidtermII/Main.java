package MidtermII;

public class Main {
    public static void main(String[] args){
        QuickServiceInterface QuickService1 = new QuickService();
        QuickService1.setService(new CheckoutService());
        QuickService1.add(new ShippingService());

        QuickService QuickService2 = new QuickService();
        QuickService2.setService(new CheckoutService());
        QuickService2.add(new ShippingService());
        QuickService2.add(new PaymentService());

        QuickService1.invokeService(Command.START);
        QuickService2.invokeService(Command.RESUME);
    }
}
