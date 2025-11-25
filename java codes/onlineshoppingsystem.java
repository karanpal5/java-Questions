
public class onlineshoppingsystem {
   
    }
    public static void main(String[] args) {
        Product laptop = new Product("Gaming Laptop", 10);
        try {
            System.out.println("Test Case 1: Buying 4 (Should Succeed)");
            laptop.purchase(4); 
        } catch (OutOfStockException e) {
            System.err.println(" ERROR: " + e.getMessage());
        }

        System.out.println("\n=\n");

        try {
            System.out.println("Test Case 2: Buying 8 (Should Fail)");
            laptop.purchase(8); 
        } catch (OutOfStockException e) {
           
            System.err.println("TRANSACTION FAILED: " + e.getMessage());
        }
        
        System.out.println("\n=\n");
        
       
        try {
            System.out.println("Test Case 3: Buying 5 (Should Succeed)");
            laptop.purchase(5);
        } catch (OutOfStockException e) {
            System.err.println(" ERROR: " + e.getMessage());
        }

        System.out.println("\n--- Final Stock Check ---");
        System.out.println("Final remaining stock for " + laptop.getName() + ": " + laptop.getAvailableStock());
    }
}


class OutOfStockException extends Exception {
    
    
    public OutOfStockException(String message) {
        super(message);
    }
}


class Product {
    private String name;
    private int availableStock;

    public Product(String name, int initialStock) {
        this.name = name;
        this.availableStock = initialStock;
    }

    public void purchase(int quantityToBuy) throws OutOfStockException {
        
        System.out.println("--- Processing purchase for: " + this.name);
        System.out.println("Checking stock... (Requested: " + quantityToBuy + " | Available: " + this.availableStock + ")");

      
        if (quantityToBuy > this.availableStock) {
          
            throw new OutOfStockException(
                "Only " + this.availableStock + " items are in stock, " +
                "but " + quantityToBuy + " were requested."
            );
        }

        this.availableStock -= quantityToBuy; 
      
        System.out.println(" Order Confirmed!");
        System.out.println("New stock level: " + this.availableStock);
    }

    
     */
    public int getAvailableStock() {
        return availableStock;
    }
    public String getName() {
        return this.name;
    }
}

