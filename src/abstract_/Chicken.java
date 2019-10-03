package abstract_;

import Interface.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken  :cuck_cuck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
