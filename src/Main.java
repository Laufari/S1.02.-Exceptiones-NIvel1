//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Sale sale = new Sale();
        System.out.println("Testing EmptySaleException:");
        ExceptionTester test1 = new ExceptionTester(sale);
        test1.forceThrowsEmptySaleException();

        System.out.println("Adding product to cart and testing again the exception:");
        Product P1 = new Product("Water", 0.25);
        Product P2 = new Product("chips", 1.25);
        Product P3 = new Product("oil", 6.55);
        sale.addProduct(P1);
        sale.addProduct(P2);
        sale.addProduct(P3);

        ExceptionTester tester = new ExceptionTester(sale);
        System.out.println("No error should be thrown");
        tester.forceThrowsEmptySaleException();


        System.out.println("Testing IndexOutOfBoundsExceptions:");
        tester.forceIndexOutOfBoundsExceptions();

    }
}
