public class Immutable{

     public static void main(String[] args) {

          College college = new College("PSIT", "Kanpur");
        
           Student s = new Student(23 , "Rohit" , college);
           System.out.println("Age : "+ s.getAge());
           System.out.println("Name: "+ s.getName());
           System.out.println("College: "+ s.getCollege().name);

     }

}

//Immutable Class --> Not Purey Immutable
final class Student{

    private final int age;
    private final String name;
    private final College college;

    Student(int age , String name , College college){
         this.age = age;
         this.name = name;
         this.college = college;
    }

    //getters
    public int getAge(){
         return this.age;
    }
    public String getName(){
            return this.name;
    }
    public College getCollege(){
            return this.college;
    }

}


class College{

    String name;
    String address;

    College(String name , String address){
          this.name = name;
          this.address = address;
    }

}