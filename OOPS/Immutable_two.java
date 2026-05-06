public class Immutable_two{
    public static void main(String[] args) {

        College c = new College("IIT G" , "Assam");
        Student s1 = new Student(23, "Mayank", c);

        System.out.println(s1.getCollege().name);

        s1.getCollege().name = "IIT B";

        System.out.println(s1.getCollege().name);
        
    }

}



//Immutable Class
final class Student{

    private final int age;
    private final String name;
    private final College college;

    Student(int age , String name , College college){
         this.age = age;
         this.name = name;
         this.college = new College(college.name , college.address);
    }

    //getters
    public int getAge(){
         return this.age;
    }
    public String getName(){
            return this.name;
    }
    public College getCollege(){
            return new College(this.college.name, this.college.address);
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