package p1;

public class SortByArea {
	
	public int compare(Cuboid c1, Cuboid c2) {
			if (c1.area() >c2.area()) {
				return 1;
			}
			else if (c1.area() < c2.area()) {
				return -1;
			}
			else return 0;
	}

}
