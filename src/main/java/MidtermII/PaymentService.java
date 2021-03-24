package MidtermII;

public class PaymentService implements ServiceInterface //By Developer B
    {
        @Override
        public void processService(Command command) {
            System.out.println("Payment service processing: " + command);
        }
    }