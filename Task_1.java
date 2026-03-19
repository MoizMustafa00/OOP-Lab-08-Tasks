package Lab_08_Tasks;

interface Payment {
    void processPayment();
}

class CreditCard implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed through Credit Card!");
    }
}

class PayPal implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed through PayPal!");
    }
}

class BankTransfer implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed through Bank Transfer!");
    }
}

class Main1 {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        c.processPayment();
        PayPal p = new PayPal();
        p.processPayment();
        BankTransfer b = new BankTransfer();
        b.processPayment();
    }
}