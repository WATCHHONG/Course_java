package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: "+ x);
		
		byte b = 100;
		int y = -b;
		// byte result = -b;  -> byte, short, int에 연산자를 쓰면 int값으로 나온다. 따라서 int 값을 byte에 넣으려 하니 오류가 발생
		System.out.println("y: "+y);
	}

}
