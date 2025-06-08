// Open Closed Principle Example in Java
public class OpenClosedPrinciple{
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        shapeManager.addShape(new Circle(5));

        shapeManager.addShape(new Rectangle(4, 6));

        double totalArea = shapeManager.calculateTotalArea();
        System.out.println("Total Area: " + totalArea);
        //Change the code above.
    }
    }