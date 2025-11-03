package 정처기.java;

class Parent8 {
	int x, y;

	Parent8(int x, int y) { // ①
		this.x=x;
		this.y=y;
	}

	int getT() { // ②
		return x*y;
	}
}



class Child8 extends Parent8 {
	int x;

	Child8 (int x) { // ③
		super(x+1, x);
		this.x=x;
	}

	int getT(int n){ // ④
		return super.getT()+n;
	}
}



class Q8 {
	public static void main(String[] args) { // ⑤
		Parent8 parent = new Child8(3); // ⑥
		System.out.println(parent.getT()); // ⑦
	}
}

/**
코드 실행순서 파악
 5 -> 6 -> 3 -> 1 -> 7 -> 2
 */