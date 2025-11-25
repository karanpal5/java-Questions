package delivery1.java;

public class delivery1 {
    
}    protected double orderAmount;

    public delivery1(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    // Abstract method to calculate delivery charges
    public abstract double calculatedelivery1Charges();

    // Non-abstract method to show final amount
    public void showFinalAmount() {
        double charges = calculatedelivery1Charges();
        double total = orderAmount + charges;
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Delivery Charges: " + charges);
        System.out.println("Total Amount to Pay: " + total);
    }
}

class StandardDelivery extends delivery1 {
    public StandardDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    public double calculatedeliveryCharges() {
        return orderAmount * 0.05; // 5% delivery charges
    }
}

class ExpressDelivery extends delivery1 {
    public ExpressDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    public double calculatedeliveryCharges() {
        return orderAmount * 0.10; // 10% delivery charges
    }
}

// Example usage
public class delivery1Test {
    public static void main(String[] args) {
        delivery1 standard = new StandardDelivery(1000);
        System.out.println("Standard Delivery:");
        standard.showFinalAmount();

        delivery1 express = new ExpressDelivery(1000);
        System.out.println("\nExpress Delivery:");
        express.showFinalAmount();
    }
}
