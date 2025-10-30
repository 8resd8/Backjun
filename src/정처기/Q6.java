package 정처기;

public class Q6 {

	public static class Parent {

		public int x(int i) { return i + 2; }
		public static String id() { return "P";}

	}

	public static class Child extends Parent {

		public int x(int i) { return i + 3; }
		public String x(String s) { return s + "R"; }
		public static String id() { return "C"; }

	}

	public static void main(String[] args) {

		Parent ref = new Child();
		System.out.println(ref.x(2) + ref.id());

	}

}

/**
 * static 메서드는 컴파일 시점에 타입이 결정 -> Parent ref -> Parent 타입결정, 뒤에 new 뭐가오든 상관없음.
 * 따라서 static 메서드인 id()는 Parent의 id()를 사용하게 됨.
 */