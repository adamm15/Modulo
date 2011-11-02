/**
 * 
 */
package math;

/**
 * @author anthony.machacon
 *
 */
public class powerOfTwo {

	/**
	 * 
	 */
	public powerOfTwo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println( " 1 : " + isPowerOfTwo(1) );
		System.out.println( " 2 : " + isPowerOfTwo(2) );
		System.out.println( " 3 : " + isPowerOfTwo(3) );
		System.out.println( " 4 : " + isPowerOfTwo(4) );
		System.out.println( " 5 : " + isPowerOfTwo(5) );
		System.out.println( " 6 : " + isPowerOfTwo(6) );
		System.out.println( " 7 : " + isPowerOfTwo(7) );
		System.out.println( " 8 : " + isPowerOfTwo(8) );
		System.out.println( " 9 : " + isPowerOfTwo(9) );
		System.out.println( "10 : " + isPowerOfTwo(10) );
		System.out.println( "11 : " + isPowerOfTwo(11) );
		System.out.println( "12 : " + isPowerOfTwo(12) );
		System.out.println( "13 : " + isPowerOfTwo(13) );
		System.out.println( "14 : " + isPowerOfTwo(14) );
		System.out.println( "15 : " + isPowerOfTwo(15) );
		System.out.println( "16 : " + isPowerOfTwo(16) );
		System.out.println( "17 : " + isPowerOfTwo(17) );
		System.out.println( "18 : " + isPowerOfTwo(18) );
		System.out.println( "19 : " + isPowerOfTwo(19) );
		System.out.println( "20 : " + isPowerOfTwo(20) );
	}
	
	private static boolean isPowerOfTwo( int num ) {
		return ((num & -num) == num);
	}

}
