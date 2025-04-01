public class ExceptionTester {
    Sale sale;

    public ExceptionTester(Sale sale) {
        this.sale = sale;
    }

    public void forceThrowsEmptySaleException() {
        try {
            double totalPrice = sale.calculateTotalPrice();
            System.out.println("Total price: " + totalPrice);
        } catch (EmptySaleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void forceIndexOutOfBoundsExceptions() {
        try {
            System.out.println(sale.getProducts().get(sale.getProducts().size()));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}