public class WrapperClass {
   public static void main(String[] args) {
    
      //AutoBoxing
      int x = 10;

      Integer y = x;

      System.out.println("X "+ x);
      System.out.println("Y "+ y);

      //Unboxing
      Integer a = Integer.valueOf(21);
      int b = a;

      System.out.println("A "+a);
      System.out.println("B "+b);

   }   
}
