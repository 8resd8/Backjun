package 정처기;

class SuperObject {
	public void paint(){
		draw();
	}

	public void draw(){
		draw();
		System.out.println("Super Object");
	}
}


class SubObject extends SuperObject {
	public void paint(){
		super.draw();
	}

	public void draw(){
		System.out.println("Sub Object");
	}
}


public class Q3{
	public static void main(String[] args){
		SuperObject a = new SubObject();
		a.paint();
	}
}

/**
 * draw가 오버라이딩 되었으니 실행 후 남은 코드 처리
 */