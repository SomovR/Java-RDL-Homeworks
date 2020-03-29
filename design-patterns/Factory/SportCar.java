package Factory;

public class SportCar implements ITransport {
    @Override
    public void answer() {
        System.out.println("this is a sport car");
    }

    @Override
    public void deliver() {
        System.out.println("nothing to deliver");
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
