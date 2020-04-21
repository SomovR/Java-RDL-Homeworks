package Factory;

public class Bus implements ITransport {
    @Override
    public void answer() {
        System.out.println("this is a bus");
    }

    @Override
    public void deliver() {
        System.out.println("delivering people");
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
