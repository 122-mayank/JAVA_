

public class Enums_4 {
    public static void main(String[] args) {
        
       Direction d = Direction.North;

       d.move();

    }
}

enum Direction{

    North{
        @Override
        public void move(){
             System.out.println("Move up");
        }
    },
    South{

         @Override
         public void move(){
             System.out.println("Move down");
         }
    },
    East{

        @Override
        public void move(){
             System.out.println("Move right");
        }
        
    },
    West{

        @Override
        public void move(){
             System.out.println("Move Left");
        }

    };


    public abstract void move();

}