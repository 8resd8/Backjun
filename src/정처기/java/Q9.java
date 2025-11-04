package 정처기.java;

class Q9 {

	public static class Collection<T>{
		T value;

		public Collection(T t){
			value = t;
		}

		public void print(){
			new Printer().print(value);
		}

		class Printer{
			void print(Integer a){
				System.out.print("A" + a);
			}
			void print(Object a){
				System.out.print("B" + a);
			}
			void print(Number a){
				System.out.print("C" + a);
			}
		}
	}

	public static void main(String[] args) {
		new Collection<>(0).print();
	}

}

/**
0은 의미상 Integer가 맞지만, 정확하게는 Integer 아닌 primitive int
 제네릭 T는 컴파일시점 Integer이지만 타입 소거로 Object, B0
 */