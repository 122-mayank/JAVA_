
abstract class A{

    int age =23; //by default it is final .....that why we can not overrride

    void name(){
         System.out.println("Name has callled!!");
    }

    abstract void call();
    abstract void run();
}

class B extends A{

    void printAge(){
         System.out.println("Age: " + super.age);
    }

    public void call(){
         System.out.println("One person is calling to other person");
    }

    public void run(){
         System.out.println("The man is running behind the theif");
    }

}

public class Abstraction {
    public static void main(String[] args) {

        B obj = new B();
        obj.call();
        obj.name();
        obj.run();
        
        obj.printAge();
    }   
}
