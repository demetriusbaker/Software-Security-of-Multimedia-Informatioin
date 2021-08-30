package Chapter34.Square;

public class Circle implements ISquare{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void getSquareInfo() {
        System.out.println("Square of circle is " +
                radius * radius * Math.PI);
    }
}
