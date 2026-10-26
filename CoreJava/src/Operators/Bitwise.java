package Operators;

public class Bitwise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 7;
		int num2 = 9;
		// 128 64 32 16 8 4 2 1 
		// 0111 => 7
		// 1001 => 9
		// 0001
		System.out.println(num1 & num2);
		// 128 64 32 16 8 4 2 1 
				// 0111 => 7
				// 1001 => 9
				// 1111
		System.out.println(num1 | num2);
		// 128 64 32 16 8 4 2 1 
				// 0111 => 7
				// 1001 => 9
				// 1110 
		System.out.println(num1 ^ num2);
		
		int num3 = 756;
		int num4 = 975;
		// 128 64 32 16 8 4 2 1 
		// 0111 => 7
		// 0101 => 5
		// 0111 => 6             
		// 011101010111 => 2^0 + 2^12^0 + 2^12^0 + 2^1
		System.out.println(num3 & num4);
		// 128 64 32 16 8 4 2 1 
				// 0111 => 7
				// 1001 => 9
				// 1111
		System.out.println(num3 | num4);
		// 128 64 32 16 8 4 2 1 
				// 0111 => 7
				// 1001 => 9
				// 1110 
		System.out.println(num3 ^ num4);
				
				
	}

}
