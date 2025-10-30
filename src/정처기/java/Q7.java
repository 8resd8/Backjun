package 정처기.java;

public class Q7 {
	public static class BO {
		public int v;
		public BO(int v) {
			this.v = v;
		}

		public String toString() {
			return "BO{" + "v=" + v + '}';
		}

	}
	public static void main(String[] args) {
		BO a = new BO(1);
		BO b = new BO(2);
		BO c = new BO(3);
		BO[] arr = {a, b, c};
		BO t = arr[0];
		arr[0] = arr[2];
		arr[2] = t;
		arr[1].v = arr[0].v;

		System.out.println(a.v + "a" + b.v + "b" + c.v);
	}
}

/**
 * 배열의 위치가 바뀌는 건 객체 자체의 값과 관련이 없다.
 * 실제로 값을 바꾸는 건 arr[1].v = arr[0].v 뿐
 * B0 t = a
 * arr[0] = c
 * arr[2] = t -> arr[2] = a
 * arr[1].v = arr[0].v = c.v = 3
 * a.v = 1
 * b.v = 3
 * c.v = 3
 */