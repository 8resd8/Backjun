package 정처기;

public class Q5{

	static interface F {
		int apply(int x) throws Exception;
	}

	public static int run(F f) {
		try {
			return f.apply(3);
		} catch (Exception e) {
			return 7;
		}
	}

	public static void main(String[] args) {

		F f = (x) -> {
			if (x > 2) {
				throw new Exception();
			}
			return x * 2;
		};

		System.out.print(run(f) + run((int n) -> n + 9));
	}

}

/**
 * run(f): 3, 예외발생 -> return 7
 * run((int n) -> n + 9): n = 3, return 12
 * 7 + 12
 * 19
 */