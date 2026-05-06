import java.util.Objects;

public class Object_Class_Demo{
    
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student();
        s1.name= "Aditya";
        s1.age = 23;

        
        Student s2 = new Student();
        s2.name ="Aditya";
        s2.age = 23;

        Student s3 = null;
        Integer i = 389;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(i));

        System.out.println(s1.hashCode() == s2.hashCode());

        Student s4 = (Student) s1.clone();
        System.out.println(s4.name + " " + s4.age);

    }
    
}

class Student extends  Object implements Cloneable{

    int age;
    String name;

    @Override
    public String toString(){
        return (name + " , "+ age);
    }
    @Override
    public boolean equals(Object obj){

        if(this == obj){
             return  true;
        }

        if(obj == null){ 
            return false;
        }
        //Check if the class of tyoe Student
        //if not so the class cast Exception is there
        if(this.getClass() != obj.getClass()){
            return false;
        }

        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);

    }


    @Override
    public int hashCode(){
        
        // int result = 17;
        // result = result * 31 + age;
        // result = result * 31 + ((name == null ? 0 : name.hashCode()));

        // return result;

        return Objects.hash(name , age);

    }
    protected  Object clone() throws CloneNotSupportedException{
         return super.clone();
    }

}