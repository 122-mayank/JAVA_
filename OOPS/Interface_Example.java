
interface A{
    void play();

    default void eat(){
         System.out.println("Eating A");
    }



}

interface B {

    void study();
    void gotoCollege();

    default void eat(){
         System.out.println("Eating is neccesaary for evry individual!!");
    }

}

class C implements A, B{

 @Override
  public void play(){
     System.out.println("Playing Game");
  }

  public void study(){
     System.out.println("Students are reading book");
  }

  public void gotoCollege(){
     System.out.println("Students go to College");
  }

  @Override
  public void eat(){
     B.super.eat();
  }

}


public class Interface_Example {
    public static void main(String[] args) {
        
     C obj = new C();
     obj.play();
     obj.eat();


    }
}
