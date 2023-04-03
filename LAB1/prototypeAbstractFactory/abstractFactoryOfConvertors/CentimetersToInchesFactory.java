package LAB1.prototypeAbstractFactory.abstractFactoryOfConvertors;

import LAB1.prototypeAbstractFactory.converterTypes.CentimetersToInchesConverter;
import LAB1.prototypeAbstractFactory.converterTypes.Converter;

public class CentimetersToInchesFactory implements ConverterFactory {
    @Override
    public Converter createConvertor() {
        return new CentimetersToInchesConverter();
    }
}
