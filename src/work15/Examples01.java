package work15;

public class Examples01 {
int x,y;
	
		public Examples01(int x,int y) {
			initialize(x,y);
		}
public void initialize(int x,int y) {
	this.x=x*x;
	this.y=y*y;
}
public static void main(String[] args) {
	int x=9,y=5;
	Examples01 obj=new Examples01(x,y);
	System.out.println(x+" "+y);
	
	}

}
