package creational.factory;

public class ShapeFactory {

	public static Shape getShape(String shapeType) {
		
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}
		
		return null;
	}
}
