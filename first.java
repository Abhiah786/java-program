public class First_1{

	public static void main(String[] args){
		int num1 = 8, num = 0;
		int[] array = new int[4];
		String string = null;
		try{
			array[4] = 27;
		}catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
		try {
			System.out.println(string.equals(anObject:"string"));	
		}catch (NullPointerException exception){
			System.out.println(exception);
		}
		try {
			System.out.println(num1 % num2);
		}catch(ArithmaticException exception) {
			System.out.println(exception);
		}
	}
}
		