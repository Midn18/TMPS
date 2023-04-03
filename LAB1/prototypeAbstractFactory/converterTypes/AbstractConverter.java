package LAB1.prototypeAbstractFactory.converterTypes;

public abstract class AbstractConverter implements Converter {

    @Override
    public abstract double convert(double value);

    public Converter clone() {
        try {
            return (Converter) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
