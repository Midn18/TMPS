package lab1.abstractFactory.animalTypes.domesticAnimal;

import lab1.abstractFactory.Animal;

public interface DomesticAnimalFactory {
    Animal createAnimal(String animalName);
}
