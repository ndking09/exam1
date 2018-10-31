package p1;

public class Cuboid extends Rectangle {
	
	public int depth;
	public Cuboid (int w, int l, int d) {
		super(w, l);
		depth=d;
	}
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int d) {
		depth = d;
	}
		
	@Override
	public double area() {
		return ((depth*length*2)+(length*width*2)+(depth*width*2));
	}

	public double volume() {
		return (length*width*depth);
	}
	
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int comparedTo(Cuboid c) {
		if (this.volume() >c.volume()) {
			return 1;
		}
		else if (this.volume() < c.volume()) {
			return -1;
		}
		else return 0;
	}
}
