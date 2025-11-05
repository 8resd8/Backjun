package 정처기.java;

public class Q10{
	public static void main(String[] args) {
		A b = new B();
		b.paint();
		b.draw();
	}
}

class A {
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
		draw();
	}
}

class B extends A {
	public void paint() {
		super.draw();
		System.out.print("C");
		this.draw();
	}
	public void draw() {
		System.out.print("D");
	}
}

/**
 * b.paint()
 * A의 paint 실행, draw() -> B의 draw() -> BDCD
 * b.draw()
 * B의 draw()-> D
 *
 * BDCDD
 */