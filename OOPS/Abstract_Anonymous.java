


abstract class A{
     abstract void sound();

     void sleep(){
       System.out.println("Sleeping...");
     }
}

public class Abstract_Anonymous {
    public static void main(String[] args) {
        
        A obj = new A(){

            void sound(){
                System.out.println("Dog Barks!!");
            }

        };

        obj.sound();
        obj.sleep();


    }
}
