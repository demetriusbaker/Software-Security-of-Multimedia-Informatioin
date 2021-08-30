package Chapter34.Square;

public class Circle implements ISquare{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void GetSquareInfo() {
        System.out.println("Square of circle is " +
                radius * radius * Math.PI);
    }
}
