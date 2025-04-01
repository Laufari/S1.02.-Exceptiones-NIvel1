import java.util.ArrayList;

public class Sale
{
    private ArrayList<Product>products;
    private double calculeTotal;

    public Sale()
     {
        this.products = new ArrayList<>();
        this.calculeTotal = 0;
    }
    public ArrayList<Product>getProducts()
    {
        return this.products;
    }
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public double calculateTotalPrice() throws EmptySaleException
    {
        if(products.isEmpty())
        {
            throw new EmptySaleException();
        }
        for (Product product : products)
        {
            calculeTotal += product.getPrice();
        }
        return calculeTotal;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "products=" + products +
                ", calculeTotal=" + calculeTotal +
                '}';
    }
}