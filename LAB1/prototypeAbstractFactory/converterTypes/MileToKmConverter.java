package LAB1.prototypeAbstractFactory.converterTypes;

public class MileToKmConverter extends AbstractConverter {
    @Override
    public double convert(double value) {
        return value * 1.609344;
    }
}
