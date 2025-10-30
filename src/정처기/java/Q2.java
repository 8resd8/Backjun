package 정처기.java;

abstract class Vehicle {
	String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name : " + name;
	}
}

class Car extends Vehicle {
	private String name;
	public Car(String val) {
		name = super.name = val;
	}

	public String getName(String val) {
		return "Car name : " + val;
	}

	public String getName(byte[] val) {
		return "Car name : " + val;
	}
}

public class Q2 {
	public static void main(String[] args) {
		Vehicle obj = new Car("Spark");
		System.out.print(obj.getName());
	}
}

/**
 * 파라미터 존재 여부 주의, obj.getName() 확인
 * Car 기준으로 찾기 -> 없으면 부모로 올라가며 찾기
 */