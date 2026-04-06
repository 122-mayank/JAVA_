interface A{
      void run();
      void sleep();
      int age = 23;
}


abstract class B implements  A{

     public void run(){
           System.out.println("You are running");
     }
}


public class Abstraction{
     
     public static void main(String[] args) {

          
          

     }

}



// abstract class A{

//    final int age = 23; //by default it is final .....that why we can not overrride

//     void name(){
//          System.out.println("Name has callled!!");
//     }

//     abstract void call();
//     abstract void run();
// }

// class B extends A{

//     void printAge(){
//          System.out.println("Age: " + super.age);
//     }

//     public void call(){
//          System.out.println("One person is calling to other person");
//     }

//     public void run(){
//          System.out.println("The man is running behind the theif");
//     }

// }

// abstract class C extends A{

//      public void run(){
//           System.out.println("Animal is running inside");
//      }

//      abstract void sleep();

// }

//  class D extends C{
    
//        public void sleep(){
//          System.out.println("Animal is sleeping");
//        }

//        public void call(){
//          System.out.println("Individual is calling to other person");
//        }

// }



// public class Abstraction {
//     public static void main(String[] args) {

//         B obj = new B();
//         obj.call();
//         obj.name();
//         obj.run();
        
//         obj.printAge();

//         //make the object of class D

//         D obj2 = new D();
//         obj2.call();
//         System.out.println(obj2.age);
//         obj2.sleep();


//     }   
// }
