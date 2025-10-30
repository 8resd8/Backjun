package 정처기;

class Parent {
	int compute(int num) {
		if (num <= 1) return num;
		return compute(num - 1) + compute(num - 2);
	}
}

class Child extends Parent {
	int compute(int num) {
		if (num <= 1) {
			return num;
		}
		return compute(num - 1) + compute(num - 3);
	}
}

public class Q1 {
	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.print(obj.compute(4));
	}

}

/**
				4
		3				1
	2		0
  1	 -1

 -1: -1
 0: 0
 1: 1
 2: 0
 3: 0
 4: 1

 */