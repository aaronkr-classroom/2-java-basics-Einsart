
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 6;
		short s = 2;
		int i = 12;
		long l = 123456789012345L;
		
		char c = 'Y';
		char c2 = 88; // ASCII
		String str = "Do you like pizza?";
		
		float f = 12.3456789f;
		double d = 1234567890.123456789; // d는 선택
		
		boolean bool = true; //소문자
		
		//출력
		System.out.println(str);
		System.out.println(bool);
		System.out.println(" " + c);
		System.out.println(); //다음줄
		System.out.println("Numbers: ");
		System.out.println("\tbyte: " + b);
		System.out.println("\shrot: " + s);
		System.out.println("\tint: " + i);
		System.out.println("\tfloat: " + f);
		System.out.println("\tDouble: " + d);
		
		System.out.println("\nChar2: " + c2);
		

	}

}
