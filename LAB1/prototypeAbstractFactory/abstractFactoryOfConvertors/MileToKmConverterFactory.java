package LAB1.prototypeAbstractFactory.abstractFactoryOfConvertors;

import LAB1.prototypeAbstractFactory.converterTypes.Converter;
import LAB1.prototypeAbstractFactory.converterTypes.MileToKmConverter;

public class MileToKmConverterFactory implements ConverterFactory {
    @Override
    public Converter createConvertor() {
        return new MileToKmConverter();
    }
}
