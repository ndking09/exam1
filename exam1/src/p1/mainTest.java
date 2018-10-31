package p1;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Rectangle r1=new Rectangle(1, 2);
	Rectangle r2=new Rectangle (2, 4);	
	
	System.out.println(r1.area());
	System.out.println(r2.area());
	
	System.out.println(r1.perimeter());
	System.out.println(r2.perimeter());
	
	if (r1.comparedTo(r2)==1){
		System.out.println("r1 is bigger");
		}
	else if (r2.comparedTo(r1)==-1){
		System.out.println("r2 is bigger");
	}
	else System.out.println("neither");

	
	
	Cuboid c1=new Cuboid (1, 2, 3);
	Cuboid c2=new Cuboid (2, 4, 6);	
	
	System.out.println(c1.area());
	System.out.println(c2.area());
	
	
	
	if (c1.comparedTo(c2)==1){
		System.out.println("c1 is bigger");
		}
	else if (c2.comparedTo(c1)==-1){
		System.out.println("c2 is bigger");
	}
	else System.out.println("neither");
	
	System.out.println(c1.perimeter());
	System.out.println(c2.perimeter());
}
}