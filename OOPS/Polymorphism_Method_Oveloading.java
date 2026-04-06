
class Maths{


    //Method Overloading
     public int square(int num){
         return num * num;
     }


     public double square(double num){
          return num * num;
     }
}


class Rectangle extends Maths{

     //Mathod Overloading

     public int area(int length , int breadth){
            return 2 * (length + breadth);
     }

     public double area(double length , double breadth){
         return 2 * (length + breadth);
     }


}

public class Polymorphism_Method_Oveloading {
    public static void main(String[] args) {

        Maths m = new Maths();

        System.out.println("Square of the integer number: "+m.square(23));

        System.out.println("Square of the double number: "+m.square(12.90));


        Rectangle r = new Rectangle();

        System.out.println("Rectangle of the integer number: " + r.area(12, 34));

        System.out.println("Rectangle of the double number: " + r.area(12.89 , 89.70));

    }
}
