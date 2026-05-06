                /*Case - 1 */
// interface A{
//     void play();
//     void study();
// }

// interface  B{
//     void study();
// }

// class C implements A , B{

//     @Override
//     public void play(){
//          System.out.println("Kids are playing!!");
//     }

//     @Override
//     public void study(){
//           System.out.println("Students are learning in Sec A ");
//     }
    

// }
                    /*Case - 2*/

interface  A{

    default void study(){
         System.out.println("From Interface A!!");
    }

}

interface B{

    default void study(){
         System.out.println("From Interface B!!");
    }

}

class C implements  A , B{

    @Override
    public void study(){
        A.super.study();
        B.super.study();
    }
}

public  class Multiple_Inheritance{

    public static void main(String[] args) {
        
       C obj = new C();
       obj.study();


    }

}