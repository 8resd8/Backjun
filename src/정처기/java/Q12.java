package 정처기.java;

public class Q12 {
	public static void main(String[] args) {
		new Child12();
		System.out.println(Parent12.total);
	}
}


class Parent12 {
	static int total = 0;
	int v = 1;

	public Parent12() {
		total += (++v);
		show();
	}

	public void show() {
		total += total;
	}
}


class Child12 extends Parent12 {
	int v = 10;

	public Child12() {
		v += 2;
		total += v++;
		show();
	}

	@Override
	public void show() {
		total += total * 2;
	}
}

/**
 * Child() 실행시 super()먼저 실행됨
 * total = 2, show() 실행 -> Child의 show(), 2 + 2 * 2 = 6
 * 이후 Child 진행, total = 6, + 12, 18, show()실행, 18 + 18*2 = 54
 * Parent.total = 54, static
 */
