package Factory;

public class TruckFactory implements TransportFactory {
    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
