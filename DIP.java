public class DIP {
    // Salah: Kelas OrderService tergantung langsung pada PaymentProcessor
    // class PaymentProcessor {
    //     public void processPayment(double amount) {
    //         System.out.println("Processing payment of $" + amount);
    //     }
    // }

    // class OrderService {
    //     private PaymentProcessor paymentProcessor = new PaymentProcessor();

    //     public void placeOrder(double amount) {
    //         paymentProcessor.processPayment(amount);
    //     }
    // }

    // Benar: Gunakan abstraksi dengan interface
    interface Payment {
        void process(double amount);
    }

    class CreditCardPayment implements Payment {
        public void process(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
    }

    class OrderService {
        private Payment payment;

        public OrderService(Payment payment) {
            this.payment = payment;
        }

        public void placeOrder(double amount) {
            payment.process(amount);
        }
    }

}
