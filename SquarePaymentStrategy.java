public class SquarePaymentStrategy implements PaymentStrategy {
        private String accessToken;

    public SquarePaymentStrategy(String accessToken) {
            this.accessToken = accessToken;
        }

        @Override
        public void processPayment(double amount) {

            System.out.println("Procesando pago de $" + amount + " con Square");
        }
    }
}
