package Chapter34.Square;

public class Rectangle implements ISquare {
    private double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void GetSquareInfo() {
        System.out.println("Square of rectangle is " +
                length * width);
    }
}
