package lesson11;

interface Creature {
    public void eat();
}

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal implements Creature{
    public void move() {
        //super.move();
        System.out.println("Dogs can walk and run");
    }
    public void bark() {
        System.out.println("Dogs can bark");
    }
    @Override
    public void eat(){
        System.out.println("Dogs eat meat");
    }
}

public class TestAnimal {

    public static void main(String args[]) {
        Animal a = new Animal();
        Dog b = new Dog();

        a.move();
        b.move();
        b.bark();
        b.eat();

        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);

        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Dog);

        System.out.println("-----------------");

        System.out.println(b instanceof Creature);
        System.out.println(b instanceof Object);

        Animal an = b;
        an.move();

        Creature c = (Creature)b;
        c.eat();

        Object o = b;
        System.out.println(o.toString());
    }
}