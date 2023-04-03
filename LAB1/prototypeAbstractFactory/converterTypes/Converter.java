package LAB1.prototypeAbstractFactory.converterTypes;

public interface Converter extends Cloneable{
    public double convert(double value);
    public Converter clone();
}
