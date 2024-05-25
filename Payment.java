public class Payment {
        public static void main(String[] args) {

            PaymentStrategy squareStrategy = new SquarePaymentStrategy("square_access_token");

            PaymentContext paymentContext = new PaymentContext(SquarePaymentStrategy);

            paymentContext.processPayment(100.50);

        }
    }
}
