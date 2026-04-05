package Java_Generics_Wrapper_Classes;

public class Generics {
    static void main(String[] args) {
        //now we can make object and assign value in any data type
        Dog<String> d1 = new Dog<>("tommy");
        Dog<Integer> d2 = new Dog<>(123);

        System.out.println(d1.id);
        System.out.println(d2.id);
        System.out.println(d1.getId());


        Cat<String,Integer> c1 = new Cat<>("meoww",11);
        System.out.println(c1.getId());
        System.out.println(c1.getName());

    }
}
//Generics in Java allow you to create classes, methods, and interfaces that can work with
// any data type while ensuring type safety at compile time.


class Dog<E>{
    E id;

    public Dog(E id){
        this.id = id;
    }

    E getId(){
        return id;
    }
}

class Cat<C,K>{
    C name;
    K id;

    Cat(C name,K id){
        this.name = name;
        this.id = id;
    }

     K getId(){
        return id;
    }
    C getName(){
        return name;
    }

}