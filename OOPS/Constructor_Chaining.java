

class A{

    A(){
        this(10);
         System.out.println("Constructor 1 is called!!");
    }

    A(int age){
        this(age , "Rahul");
         System.out.println("Constructor 2 is called!!");
    }

    A(int age , String name){
          this(age , name , 90);
          System.out.println("Constructor 3 is called!!");
    }

    A(int age , String name , int marks){
         this(age , name , marks , 34);
         System.out.println( "Constructor 4 is called!!");
    }

    A(int age , String name , int marks , int rollno){
         this(age , name , marks , rollno , "B.TECH");
         System.out.println("Constructor 5 is called!!");
    }
    
    A(int age , String name , int marks ,int rollno , String course){
          System.out.println("Constructor 6 is called!!");
    }

}

public class Constructor_Chaining {
        public static void main(String[] args) {
            A obj = new A();
        }   
}
