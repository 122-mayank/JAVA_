
interface Study {

    String college ="IIT Kanpur";  // automatic it is public static final

    static void open(){ 
         System.out.println("College has opened at 9:00 am in morning");
    }

    default public void knowId(){
          System.out.println("Everyone has own unique id");
    }

     void teach();
     void learn();
     void write();
}

class B_TECH implements Study{

    @Override
    public void teach(){
         System.out.println("Teaching the technical skills!!");
    }

    public void learn(){
         System.out.println("Learning the syntax of Programming lang!!");
    }

    public void write(){
         System.out.println("Effectively write the code to solve the real world problem");
    }

    @Override
    public void knowId(){
        System.out.println("B.Tech department has own unique ID");
    }

}


class BBA implements Study{

     @Override
   public void teach(){
     System.out.println("Teaching the management building skills");
   }
   
   public void learn(){
     System.out.println("Learning the planning ecosystem of business goals"); 
   }

   public void write(){
     System.out.println("Executing plans based on writing criteria");
   }

   @Override
   public void knowId(){
      System.out.println("BBA Department has our unique Id");
   }

}

public class interface_one {
     public static void main(String[] args) {

        Study.open(); //static methods can be call with the class

        System.out.println("Name of the college: "+ Study.college);
        

        BBA obj = new BBA();

        obj.teach();
        obj.learn();
        obj.write();

       // B.open(); // cannot be called ? why ? because of static member can be accessed by the own class


        
     }
}
