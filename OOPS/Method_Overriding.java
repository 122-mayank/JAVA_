// class A{

//     public static void show(){
//          System.out.println("A is called!!");
//     }
// }

// class B extends A{

//     public static void show(){
//             System.out.println("B is called !!");
//     }
// }

import java.util.Scanner;

abstract class A{

     int age;
     String name;

    A(int age , String name){
         this.age = age;
         this.name = name;
    }

    abstract public void read();
    abstract public void write();
    abstract public void display();

    public void print(){
         System.out.println("Printing the text!!");
    }
     
}

class B extends A{


    B(int age, String name){
         super(age , name); 
    }

    public void read(){
         System.out.println("Reading the text ");
    }

    public void write(){
         System.out.println("Writing the text");
    }

    public void display(){
         System.out.println("Name: "+ name + " , Age:  "+ age);
    }
}


public class Method_Overriding {
    public static void main(String[] args) {
        // A a = new B();
        // a.show();

        
        //Method Overriding   

        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter the age: ");
        age = sc.nextInt();

        String name;
        System.out.println("Enter the String: ");
        name = sc.next();

        A obj = new B(age , name);
        obj.print();
        obj.read();
        obj.write();
        obj.display();
    
    }
}
