package src.main.oop.polymorphism.cast;


import src.main.oop.polymorphism.domain.Alive;
import src.main.oop.polymorphism.domain.Animal;
import src.main.oop.polymorphism.domain.BritishCat;
import src.main.oop.polymorphism.domain.Cat;

public class Cast {
    public static void main(String[] args) {

        Alive alive = new Alive();//Her canlı canlıdır. --> Doğru
        System.out.println("Her " + alive + " canlıdır.");

        alive = new Animal();//Her hayvan canlıdır.--> Doğru, otomatik upcasting
        System.out.println("Her " + alive + " canlıdır.");

        alive = new Cat();//Her kedi canlıdır.--> Doğru, otomatik upcasting
        System.out.println("Her " + alive + " canlıdır.");

        alive = new BritishCat();//Her ingiliz kedisi canlıdır. --> Doğru, otomatik upcasting
        System.out.println("Her " + alive + " canlıdır.");

        System.out.println("\n");

        Animal animal = new Animal();//Her hayvan hayvandır.--> Doğru
        System.out.println("Her " + animal + " hayvandır.");

        animal = new Cat();//Her kedi hayvandır.--> Doğru, otomatik upcasting
        System.out.println("Her " + animal + " hayvandır.");

        animal = new BritishCat();//Her ingiliz kedisi hayvandır. --> Doğru, otomatik upcasting
        System.out.println("Her " + animal + " hayvandır.");

        animal = (Animal) new Alive();//Her canlı hayvandır. -->Yanlış derleyici hata göstermsin diye downcasting de yaptık ama Runtime'da ClassCastException aldık.
        System.out.println("Her " + animal + " hayvandır.");
    }
}
