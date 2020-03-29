package Factory;

public class SportCarFactory implements TransportFactory{
    @Override
    public ITransport createTransport() {
        return new SportCar();
    }
}
