package LAB1.prototypeAbstractFactory.abstractFactoryOfConvertors;

import LAB1.prototypeAbstractFactory.converterTypes.Converter;
import LAB1.prototypeAbstractFactory.converterTypes.KmToMileConverter;

public class KmToMileConverterFactory implements ConverterFactory {
    @Override
    public Converter createConvertor() {
        return new KmToMileConverter();
    }
}
