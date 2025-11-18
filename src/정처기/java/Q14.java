package 정처기.java;

enum Tri {
	A("A"), B("AB"), C("ABC");

	private String code;

	Tri(String code) {
		this.code = code;
	}

	public String code() {
		return code;
	}
}

public class Q14 {
	public static void main(String[] args) {
		Tri t = Tri.values()[Tri.A.name().length()];
		System.out.print(t.code());
	}
}

/**
 * Tri.values() -> [A, B, C]
 * Tri.A.name().length() -> 1
 * Tri.values()[1] -> B
 * B.code() -> AB
 */