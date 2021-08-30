package Chapter34.Square;

public class Rectangle implements ISquare {
    private final double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void getSquareInfo() {
        System.out.println("Square of rectangle is " +
                length * width);
    }
}
