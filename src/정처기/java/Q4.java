package 정처기.java;

public class Q4 {
	public static void change(String[] data, String s){
		data[0] = s;
		s = "Z";
	}

	public static void main(String[] args) {
		String data[] = { "A" };
		String s = "B";
		change(data, s);
		System.out.print(data[0] + s);
	}
}

/**
 * data[0] = s, s는 String 불변.
 *
 */