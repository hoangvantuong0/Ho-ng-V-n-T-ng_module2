package _07_abstract_class_interface.practice.animal;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "I would like to eat meat!";
    }
}
