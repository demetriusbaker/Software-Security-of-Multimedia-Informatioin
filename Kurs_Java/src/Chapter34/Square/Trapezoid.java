package Chapter34.Square;

public class Trapezoid implements ISquare {
    private double smallBase, largeBase, height;

    public Trapezoid(double smallBase, double largeBase, double height){
        this.smallBase = smallBase;
        this.largeBase = largeBase;
        this.height = height;
    }

    @Override
    public void GetSquareInfo() {
        System.out.println("Square of trapezoid is " +
                (smallBase + largeBase) * height / 2);
    }
}
