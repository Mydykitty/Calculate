
public class Calculate {
	
	public static float plus(float a, float b) {
		return a + b;
	}
	
	public static float minus(float a, float b) {
		return a - b;
	}
	
	public static float times(float a, float b) {
		return a * b;
	}
	
	public static float divide(float a, float b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 2.0f;
		float b = 3.0f;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + plus(a, b));
		System.out.println("a - b = " + minus(a, b));
		System.out.println("a * b = " + times(a, b));
		System.out.println("a / b = " + divide(a, b));
	}
}


