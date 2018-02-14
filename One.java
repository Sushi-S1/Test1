package firstTest;

public class One {
	
public static int a = 5;
public static int b = 9;
	
	public static void main(String[] args) {

		int a = 5;
		int b = 9;
		boolean X = true;
		a = hello(a);
		b = hello2(b);
		System.out.println(a + b);
		System.out.println(X);

	}

	public static int hello(int param) {
		param++;
		return param;
		
	}
	
	public static int hello2(int param) {
    
		if (param < 8) {
			param = 8;
			
		}
		else {
			param = 10;
		}
		return param;
	}
	
	public static boolean helloV2(boolean param) {
		if (a < 20) {
			param = false;
		}
		else if (a >=20 && b <=12){
			param = true;
		}
		return param;
	}

}

