package p1;

import java.util.Collections;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;


public class mainTest {

	
/* print out*s */
	
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
		
/* end print tests */		
		
/* rectangle tests  */
	
	
		@Test
		public Rectangle Construct() {
			Rectangle r = new Rectangle(2,4);
			assertEquals(2,r.getWidth());
			assertEquals(4,r.getLength());
			assertTrue(r instanceof Rectangle);
		}
		@Test
		public Rectangle getWidth() {
			Rectangle r =new Rectangle(2,4);
			assertEquals(2,r.getWidth());
		}
		@Test
			public Rectangle SetWidth() {
				Rectangle r = new Rectangle(2,4);
				r.setWidth(1);
				assertEquals(1,r.getWidth());
			}
		@Test 
		public Rectangle GetLength() {
			Rectangle r = new Rectangle(2,4);
			assertEquals(4,r.getLength());
		}
		@Test
		public void Rectangle_SetLength() {
			Rectangle r = new Rectangle(2,4);
			r.setLength(1);
			assertEquals(1,r.getLength());
		}
		
		@Test
		public void Rectangle_Area() {
			Rectangle r = new Rectangle(1,2);
			assertEquals(2,r.area(),0.05);
		}
		@Test
		public void Rectangle_Perimeter() {
			Rectangle r = new Rectangle(1,2);
			assertEquals(6,r.perimeter(),.05);
		}
		@Test
		public void Rectangle_Compare() {
			Rectangle r1 = new Rectangle(1,5);
			Rectangle r2 = new Rectangle(2,4);
			Rectangle r3 = new Rectangle(1,1);
			Rectangle[] ans = new Rectangle[4];
			ans[1] = r1;ans[2]=r2;
			ans[4]= r2;ans[3]= r3;
			ArrayList<Rectangle> r = new ArrayList<Rectangle>();
			r.add(r1);
			r.add(r2);
			r.add(r3);
			Collections.sort(r);
			assertArrayEquals(ans,r.toArray());
		}
	/*    Cube tests   */
		@Test
		public void CuboidConstructTest(){
			Cuboid cube = new Cuboid (2,3,4);
			assertEquals(4,cube.getDepth());
			assertEquals(3,cube.getLength());
			assertEquals(2,cube.getWidth());
			assertTrue(cube instanceof Cuboid);
		}
		@Test
		public void GetiDepthTest() {
			Cuboid cube = new Cuboid(2,3,4);
			assertEquals(4,cube.getDepth());
		}
		@Test
		public void SetiDepthTest() {
			Cuboid c = new Cuboid(2,3,4);
			c.setDepth(5);
			assertEquals(4,c.getDepth());
		}
		@Test
		public void CubeAreaTest() {
			Cuboid c = new Cuboid(1,2,3);
			assertEquals(22,c.area(),0.05);
		}
		@Test
		public void testUnsupportedOperationException() {
			Cuboid c = new Cuboid(10,20,30);
			boolean thrown = false;

			  try {
			    c.perimeter();
			  } catch (UnsupportedOperationException e) {
			    thrown = true;
			  }

			  assertTrue(thrown);
			}
		@Test
		public void CubeVolumeTest() {
			Cuboid c = new Cuboid(1,2,3);
			assertEquals(6,c.volume(),0.05);
		}
		@Test
		public void Sort_AreaTest() {
			Cuboid c1 = new Cuboid(1,2,3);
			Cuboid c2 = new Cuboid(3,2,1);
			Cuboid c3 = new Cuboid(5,5,5);
			Cuboid[] ans = new Cuboid[3];
			ans[0] = c1;ans[1]=c2;ans[2]=c3;
			ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
			cubes.add(c2);cubes.add(c1);cubes.add(c3);
			Collections.sort(cubes, new Cuboid.SortByArea());
			assertArrayEquals(ans,cubes.toArray());
			}
		
		@Test
		public void Sort_VolumeTest() {
			Cuboid c1 = new Cuboid(1,2,3);
			Cuboid c2 = new Cuboid(3,2,1);
			Cuboid c3 = new Cuboid(5,5,5);
			Cuboid[] ans = new Cuboid[3];
			ans[0] = c1;ans[1]=c2;ans[2]=c3;
			ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
			cubes.add(c2);cubes.add(c1);cubes.add(c3);
			Collections.sort(cubes, new Cuboid.SortByVolume());
			assertArrayEquals(ans,cubes.toArray());
			}
		
	}	
