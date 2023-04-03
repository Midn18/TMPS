package LAB1.abstractFactory.animalTypes.wildAnimal;

import LAB1.abstractFactory.Animal;

public interface WildAnimalFactory {
    Animal createAnimal(String animalName);
}
