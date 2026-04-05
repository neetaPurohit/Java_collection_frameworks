package Java_Generics_Wrapper_Classes;

public class Generics {
    static void main(String[] args) {
        //now we can make object and assign value in any data type
        Dog<String> d1 = new Dog<>("tommy");
        Dog<Integer> d2 = new Dog<>(123);

        System.out.println(d1.id);
        System.out.println(d2.id);
        System.out.println(d1.getId());
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