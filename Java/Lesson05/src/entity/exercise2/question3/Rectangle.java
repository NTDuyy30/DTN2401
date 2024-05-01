package entity.exercise2.question3;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float perimeter() {
		return 2 * (this.length + this.width);
	}

	public float area() {
		return this.length * this.width;
	}
}
