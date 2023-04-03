package LAB1.prototypeAbstractFactory.converterTypes;

public class CentimetersToInchesConverter extends AbstractConverter {
    @Override
    public double convert(double value) {
        return value * 0.393701;
    }
}
