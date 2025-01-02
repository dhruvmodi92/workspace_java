package dhruv.aneri;

public class Drawing {

	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape()
	{
		System.out.println("Drawing app");
		this.shape.draw();
	}
}
