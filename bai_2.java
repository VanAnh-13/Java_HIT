package bai_tap_buoi_1;

import java.util.Scanner;

public class bai_2 
{
	public static long giaiThua( int number )
	{
		long gt = 1;
		
		if( number == 0 || number == 1 )
			return 1;
		
		for( int i = 2; i <= number; i++ )
			gt *= i;
		
		return gt;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// a
			System.out.println("Enter input a : ");
		
			int number1 = input.nextInt();
			
			double S = 1;
			
			for( int i = 2; i <= number1; i++ )
				S += (double) 1 / i;
			
			System.out.println("Gia tri cua bieu thuc la : " + S);
			
		// b
			System.out.println("Enter input b : ");
			
			int number2 = input.nextInt();
			
			long P = 0;
			
			for( int i = 1; i <= number2; i++ )
				P += giaiThua(i);
			
			System.out.println("Gia tri cua bieu thuc la : " + P);
			
		input.close();
	}
}
