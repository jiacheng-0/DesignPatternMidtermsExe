package MidtermII;

public class ShippingService implements ServiceInterface  //By Developer B
    {
        @Override
        public void processService(Command command) {
            System.out.println("Shipping service processing: " + command);
        }
    }