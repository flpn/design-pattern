package creational.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		Shape shape1 = ShapeFactory.getShape("square");
		Shape shape2 = ShapeFactory.getShape("circle");
		
		shape1.draw();
		shape2.draw();
	}
}
