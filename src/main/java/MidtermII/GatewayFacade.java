package MidtermII;

public class GatewayFacade { //By Developer A
    String gatewayName = "ITSA Gateway";

    //ctor needs to be private
    private GatewayFacade(){}

    public static GatewayFacade instance;

    public static GatewayFacade getGatewayFacade() {
        if(instance == null){
            instance = new GatewayFacade();
        }
        return instance;
    }
    public static void invokeService(ServiceType service,
                                     Command command) {
        if (service == ServiceType.PaymentService) {
            new PaymentService().processService(command);
        } else if (service == ServiceType.ShippingService) {
            new ShippingService().processService(command);
        } else if (service == ServiceType.CheckoutService) {
            new CheckoutService().processService(command);
        } else {
            System.out.println(
                    "No service found for " + service);
        }
    }
    public void setGetewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }
    public String getGetewayName() {
        return this.gatewayName;
    }
}