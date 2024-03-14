package Day08.Ex02_Shape;

public class Point {

	
	//멤버변수로 정수형 변수 x, y를 선언하시오
	int x, y;
	
	// alt + shift + S -> Generate constructor Using Field...
	//기본생성자와 x,y를 매개변수로 갖는 생성자를 정의하시오.
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// alt + shift + S -> toString()
	//toString()메소드를 재정의하시오.
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}
