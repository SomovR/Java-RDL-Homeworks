package Factory;

public class Truck implements ITransport {
    @Override
    public void answer() {
        System.out.println("this is a truck");
    }

    @Override
    public void deliver() {
        System.out.println("delivering some cargo");
    }

    @Override
    public void putProduct(IProduct product) {
        product.getSize();
        product.getWeight();
    }

    @Override
    public IProduct getProduct() {
        return null;
    }
}
