package lab1.abstractFactory.animalTypes.wildAnimal;

import lab1.abstractFactory.Animal;

public interface WildAnimalFactory {
    Animal createAnimal(String animalName);
}
