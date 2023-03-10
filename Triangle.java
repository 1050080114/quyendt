package javaapplication8;
public class Triangle {
	private float width;
	private float height;

	public Triangle() {
		this.width = 0.0f;
		this.height = 0.0f;
	}

	public Triangle(float width, float height) {
		if (height > 0 && width > 0) {
			this.height = height;
			this.width = width;
		}
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

        @Override
	public String toString() {
		return ("Triangle (Width = " + this.width + ", Height = " + this.height + ")");
	}
}
