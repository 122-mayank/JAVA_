
interface A{
    void play();
}


public class Anonymous{

    public static void main(String args[]){
        
        A obj = new A(){
              
             public void play(){
                 System.out.println("Playing Football");
             }

        };

        obj.play();

    }

}