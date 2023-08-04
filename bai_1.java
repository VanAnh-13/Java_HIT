package bai_tap_buoi_1;

import java.util.Scanner;

public class bai_1
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input : ");
		
		int canh = input.nextInt();
		
		for( int i = 0; i < canh; i++ )
		{
			for( int j = 0; j < canh; j++ )
			{
				if(j == 0 || j == canh - 1 || i == 0 || i == canh - 1)
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
			System.out.print("\n");
		}
		input.close();
	}

}
