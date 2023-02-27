package src.main.oop.polymorphism.instanceoff;

import src.main.oop.polymorphism.domain.Alive;
import src.main.oop.polymorphism.domain.Animal;
import src.main.oop.polymorphism.domain.BritishCat;
import src.main.oop.polymorphism.domain.Cat;

public class InstanceOf {
    public static void main(String[] args) {

        wrongUse();
//        correctUse();

    }

    private static void correctUse() {
        Alive alive = new Alive();
        System.out.print(alive+" ->");
        correctUseInstanceOf(alive);

        alive = new Animal();
        System.out.print(alive+" ->");
        correctUseInstanceOf(alive);

        alive = new Cat();
        System.out.print(alive+" ->");
        correctUseInstanceOf(alive);

        alive = new BritishCat();
        System.out.print(alive+" ->");
        correctUseInstanceOf(alive);

        System.out.print(Object.class.getSimpleName()+" ->");
        correctUseInstanceOf(new Object());
    }

    private static void correctUseInstanceOf(Object object) {

        if (object instanceof BritishCat) {
            System.out.println("Bu bir " + BritishCat.class.getSimpleName());
        } else if (object instanceof Cat) {
            System.out.println("Bu bir " + Cat.class.getSimpleName());
        } else if (object instanceof Animal) {
            System.out.println("Bu bir " + Animal.class.getSimpleName());
        } else if (object instanceof Alive) {
            System.out.println("Bu bir " + Alive.class.getSimpleName());
        } else {
            System.out.println("Ne olduğunu anlamadım galiba bu bir "+object.getClass().getSimpleName());
        }
    }

    private static void wrongUse(){
        Alive alive = new Alive();
        System.out.print(alive+" ->");
        wrongUseInstanceOf(alive);

        alive = new Animal();
        System.out.print(alive+" ->");
        wrongUseInstanceOf(alive);

        alive = new Cat();
        System.out.print(alive+" ->");
        wrongUseInstanceOf(alive);

        alive = new BritishCat();
        System.out.print(alive+" ->");
        wrongUseInstanceOf(alive);

        System.out.print(Object.class.getSimpleName()+" ->");
        wrongUseInstanceOf(new Object());
    }
    private static void wrongUseInstanceOf(Object object) {

        if (object instanceof Alive) {
            System.out.println("Bu bir " + Alive.class.getSimpleName());
        } else if (object instanceof Animal) {
            System.out.println("Bu bir " + Animal.class.getSimpleName());
        } else if (object instanceof Cat) {
            System.out.println("Bu bir " + Cat.class.getSimpleName());
        } else if (object instanceof BritishCat) {
            System.out.println("Bu bir " + BritishCat.class.getSimpleName());
        } else {
            System.out.println("Ne olduğunu anlamadım galiba bu bir "+object.getClass().getSimpleName());
        }
    }
}
