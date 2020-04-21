package Factory;

public class BusFactory implements TransportFactory {
    @Override
    public ITransport createTransport() {
        return new Bus();
    }
}
