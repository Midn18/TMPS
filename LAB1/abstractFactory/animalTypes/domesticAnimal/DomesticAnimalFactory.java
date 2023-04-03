package LAB1.abstractFactory.animalTypes.domesticAnimal;

import LAB1.abstractFactory.Animal;

public interface DomesticAnimalFactory {
    Animal createAnimal(String animalName);
}
