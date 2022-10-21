package com.github.tel_ran_de.task_1410.task3;

public class CastingObjects {
    private static class Animal {
        public void voice() {
            System.out.println("Кря");
        }
    }

    private static class Cat extends Animal {
        public void voice() {
            System.out.println("Мяу");
        }

        public void catchMouse() {
            System.out.println("Поймать мышь");
        }
    }

    private static class Dog extends Animal {
        public void voice() {
            System.out.println("Гав");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Cat(), new Dog(), new Dog(), new Dog()};

        for (Animal animal : animals) {
            animal.voice();

            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.catchMouse();
            }
        }

        Cat[] cats = {new Cat(), new Cat()};
        for (Cat cat : cats) {
            cat.catchMouse();
        }
    }
}
