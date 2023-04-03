package LAB1.prototypeAbstractFactory.converterTypes;

public class KmToMileConverter extends AbstractConverter {
    @Override
    public double convert(double value) {
        return value * 0.621371;
    }
}
