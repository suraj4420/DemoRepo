
public class Rectangle {
	
	int width;
	int length;
	
	public void inser(int w,int l) {
		width=w;
		length=l;
		
	}
	public void calculateArea() {
		System.out.println("Calculating the Area: "+width*length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.inser(32, 45);
r2.inser(56, 98);
r1.calculateArea();
r2.calculateArea();
	}

}
