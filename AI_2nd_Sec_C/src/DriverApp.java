
public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(10,20);
		//The constructor DrawingApp(Rectangle) 
		//is undefined//
		DrawingApp d1 = new DrawingApp(r);
		d1.draw();

	}

}
