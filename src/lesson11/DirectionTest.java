package lesson11;

/*Write a method that takes an enum Direction(EAST,WEST,NORTH,SOUTH)
as an input and prints the new directions that one will be facing after
turning right or turning left from this initial direction enum.*/
enum DirectionEnum {
    NORTH("north"), WEST("west"), EAST("east"), SOUTH("south");
    private String move;
    DirectionEnum(String move) {
        this.move = move;
    }
//    public String getMove() {
//        return move;
//    }
}
public class DirectionTest{
    public static void main(String[] args) {
        DirectionEnum direction = DirectionEnum.WEST;
        switch (direction){
            case WEST:
                System.out.println("If i go right then I am facing NORTH");
                System.out.println("If i go left then I am facing SOUTH");
                break;
            case EAST:
                System.out.println("If i go left then I am facing NORTH");
                System.out.println("If i go right then I am facing SOUTH");
                break;
            case NORTH:
                System.out.println("If i go left then I am facing west");
                System.out.println("If i go right then I am facing east");
                break;
            case SOUTH:
                System.out.println("If i go left then I am facing east");
                System.out.println("If i go right then I am facing west");
                break;
        }
    }
}