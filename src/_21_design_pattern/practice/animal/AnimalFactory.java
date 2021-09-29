package _21_design_pattern.practice.animal;

    public class AnimalFactory {
        public Animal getAnimal(String type) {
            if ("canine".equals(type)) {
                return new Dog();
            } else {
                return new Cat();
            }
        }
    }
