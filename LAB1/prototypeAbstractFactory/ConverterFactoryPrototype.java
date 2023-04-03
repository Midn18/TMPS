package LAB1.prototypeAbstractFactory;

import LAB1.prototypeAbstractFactory.abstractFactoryOfConvertors.ConverterFactory;
import LAB1.prototypeAbstractFactory.converterTypes.Converter;

import java.util.HashMap;
import java.util.Map;

public class ConverterFactoryPrototype {

    private static Map<String, ConverterFactory> prototypes = new HashMap<>();

    public static void addPrototype(String name, ConverterFactory prototype) {
        prototypes.put(name, prototype);
    }

    public static Converter getPrototype(String type) {
       return prototypes.get(type).createConvertor();
    }
}
