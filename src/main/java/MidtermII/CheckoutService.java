package MidtermII;

public class CheckoutService implements ServiceInterface //By Developer B
    {
        @Override
        public void processService(Command command) {
            System.out.println("Checkout service processing: " + command);
        }
    }