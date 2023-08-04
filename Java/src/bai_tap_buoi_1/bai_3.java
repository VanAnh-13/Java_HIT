package bai_tap_buoi_1;

import java.util.Scanner;

public class bai_3
{
	
	public static int nguyenTo( int number )
	{
		if( number == 1 || number == 0 )
			return 0;
		
		for( int i = 2; i <= Math.sqrt(number); i++ )
			if( number % i == 0 )
				return 0;
		
		return 1;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap dau vao so nguyen duong : ");
		
		int number = input.nextInt();
		
		String out;
		
		out = (nguyenTo(number) == 1) ? ( "la so nguyen to") : ("khong la so nguyen to");
		
		System.out.println(number + " " + out);
		
		input.close();
	}

}
