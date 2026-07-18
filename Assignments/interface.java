interface payable {
    void processPayment(double amount);
    string getPaymentStatus();
    void refundPayment(double amount);
}
// interface 2
interface Taxable {
   double calculateTax();
   void generateInvoice();
}
//interface 3
interface loggable {
    void logActivity(string action);
}

class CreditCardPayment implements payable, Taxable, loggable {
    private string cardNumber;
    private string status = "Pending";
    private double amount;
    private double tax;
    public CreditCardPayment(string cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public string getPaymentStatus() {
        return status;
    }     

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding credit card payment of $" + amount);
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.1; // Assuming 10% tax
        return tax;
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice for credit card payment of $" + amount + " with tax $" + tax);
    }

    @Override
    public void logActivity(string action) {
        System.out.println("Logging activity: " + action);
    }
}