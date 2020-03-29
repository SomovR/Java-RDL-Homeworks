package Factory;


public class Main {
    static TransportFactory transportFactory;
    static ITransport transport;
    static IProduct product;

    public static void main(String[] args) {
        transportFactory = createTransportByType("truck");
        transport = transportFactory.createTransport();
        transport.answer();
        transport.deliver();
        transport.getProduct();
        transport.putProduct(product);
        System.out.println();
        transportFactory = createTransportByType("sport car");
        transport = transportFactory.createTransport();
        transport.answer();
        transport.deliver();
        transport.getProduct();
        transport.putProduct(product);
        System.out.println();
        transportFactory = createTransportByType("bus");
        transport = transportFactory.createTransport();
        transport.answer();
        transport.deliver();
        transport.getProduct();
        transport.putProduct(product);
    }

    private static TransportFactory createTransportByType(String type) {
        switch (type.toLowerCase()) {
            case "truck":
                product = new IProduct() {
                    @Override
                    public void getWeight() {
                        System.out.println("8 tons");
                    }

                    @Override
                    public void getSize() {
                        System.out.println("large");
                    }
                };
                return new TruckFactory();
            case "sport car":
                product = new IProduct() {
                    @Override
                    public void getWeight() {
                        System.out.println("2 tons");
                    }

                    @Override
                    public void getSize() {
                        System.out.println("small");
                    }
                };
                return new SportCarFactory();
            case "bus":
                product = new IProduct() {
                    @Override
                    public void getWeight() {
                        System.out.println("10 tons");
                    }

                    @Override
                    public void getSize() {
                        System.out.println("extra large");
                    }
                };
                return new BusFactory();
            default:
                throw new IllegalArgumentException(type + " is undefined.");
        }
    }
}
