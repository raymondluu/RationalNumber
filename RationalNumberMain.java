public class RationalNumberMain {
	public static void main( String [] args ) {
		RationalNumber r1 = new RationalNumber( 1, 2 );
		System.out.println( "r1 = " + r1.toString() );
		
		RationalNumber r2 = new RationalNumber( -3, -1 );
		System.out.println( "r2 = " + r2.toString() );
		
		System.out.println( "r2 = " + r2.getNumerator()
									+ "/" + r2.getDenominator() );
									
		RationalNumber r3 = new RationalNumber( 1, 3 );
		System.out.println( "r3 = " + r3.toString() );
		
 		System.out.print( "r1 = (" + r3.toString()
 								+ ") + (" + r1.toString() + ") = " );						
		r1.add( r3 );
		System.out.println( r1.toString() );
		
		RationalNumber r4 = new RationalNumber( 1, 10 );
		System.out.println( "r4 = " + r4.toString() );
		
		System.out.print( "r1 = (" + r4.toString()
								+ ") + (" + r1.toString() + ") = " );						
		r1.add( r4 );
		System.out.println( r1.toString() );
		
		RationalNumber r5 = new RationalNumber( 1, 2 );
		RationalNumber r6 = new RationalNumber( 1, 2 );
		System.out.print( "r5 = (" + r5.toString()
								+ ") - (" + r6.toString() + ") = " );
		r5.subtract( r6 );
		System.out.println( r5.toString() );
		
		RationalNumber r7 = new RationalNumber( 7, 12 );
		RationalNumber r8 = new RationalNumber( 1, 3 );
		System.out.print( "r7 = (" + r7.toString()
								+ ") - (" + r8.toString() + ") = " );
		r7.subtract( r8 );
		System.out.println( r7.toString() );
		
		RationalNumber r9 = new RationalNumber( 7, 12 );
		RationalNumber r10 = new RationalNumber( 3, 7 );
		System.out.print( "r9 = (" + r9.toString()
								+ ") * (" + r10.toString() + ") = " );
		r9.multiply( r10 );
		System.out.println( r9.toString() );
		
		RationalNumber r11 = new RationalNumber( 7, 12 );
		RationalNumber r12 = new RationalNumber( 7, 6 );
		System.out.print( "r11 = (" + r11.toString()
								+ ") / (" + r12.toString() + ") = " );
		r11.divide( r12 );
		System.out.println( r11.toString() );
		
		RationalNumber r13 = new RationalNumber( 1, -2 );
		System.out.println( "r13 = " + r13.toString() );
		
		RationalNumber r14 = new RationalNumber( 7, 12 );
		RationalNumber r15 = new RationalNumber( -7, 6 );
		System.out.print( "r14 = (" + r14.toString()
								+ ") / (" + r15.toString() + ") = " );
		r14.divide( r15 );
		System.out.println( r14.toString() );
		
		/* rex tests whether exception is thrown for denominator of zero. */
		
// 		RationalNumber rex = new RationalNumber( 1, 0 );
// 		System.out.println( "rex = " + rex.toString() );
		
		/* rey and rez test whether exception is thrown for divide by zero. */
// 		RationalNumber rey = new RationalNumber( 7, 12 );
// 		RationalNumber rez = new RationalNumber( 0, 1 );
// 		System.out.print( "rey = " + rey.toString()
// 								+ " / " + rez.toString() + " = " );
// 		rey.divide( rez );
// 		System.out.println( rez.toString() );
	}
}