package p1;

public class Rectangle extends Shape{
	
	public int width;
	public int length;
	public Rectangle (int w, int l) {
		width =w; 
		length =l;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	public double area() {
		return (length * width);
	}
	
	
	public double perimeter() {
		return ((length*2)+(width*2));
	}
	
	

	public int comparedTo(Rectangle r) {
		if (this.area() >r.area()) {
			return 1;
		}
		else if (this.area() < r.area()) {
			return -1;
		}
		else return 0;
	}


	
}
