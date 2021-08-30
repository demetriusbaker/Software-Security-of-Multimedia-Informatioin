package Chapter2.Pivass;

public class Circle {
    double radius, x, y;

    public Circle(){
        radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double x, double y){
        radius = 1;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius, double x, double y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public String GetCharacteristics(){
        return "Radius: " + radius + "; \n" +
        "X: " + x + "; \n" + "Y: " + y + ";" + "\n";
    }

    public void ChangeXAndY(double x, double y){
        this.x += x;
        this.y += y;
    }

    public void ChangeRadius(double radius){
        this.radius = radius;
    }

    public double GetSquare(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double GetLengthCircle(){
        return 2 * Math.PI * radius;
    }
}
