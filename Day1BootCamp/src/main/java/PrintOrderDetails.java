public class PrintOrderDetails {
    public static void main(String[] args) {
        // Check if there are exactly four command line arguments
        if (args.length != 4) {
            System.out.println("Usage: java PrintOrderDetails <OrderID> <ItemName> <Quantity> <TotalCost>");
            System.exit(1);
        }

        // Parse command line arguments
        int orderId = Integer.parseInt(args[0]);
        String itemName = args[1];
        int quantity = Integer.parseInt(args[2]);
        double totalCost = Double.parseDouble(args[3]);

        // Print order details
        System.out.printf("Order %d: %d of %s for a total of Rs %.2f.%n", orderId, quantity, itemName, totalCost);
    }
}
