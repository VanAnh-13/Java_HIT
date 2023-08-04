package bai_tap_buoi_1;

import java.util.Scanner;

public class bai_5 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Chanh : ");
		int chanh = input.nextInt();
		
		System.out.println("Tao : ");
		int tao = input.nextInt();
		
		System.out.println("Le : ");
		int le = input.nextInt();
		
		int taoDung = 0, leDung = 0, chanhDung = 0;
		
		for( int i = 1; i <= chanh; i++ ) 
		{
			for( int j = 1; j <= tao; j++ )
			{
				for( int k = 1; k <= le; k++ )
				{
					if( j / i == 2 && k / i == 4)
					{
						chanhDung = i;
						taoDung = j;
						leDung = k;
						break;
					}
				}
			}
		}
		
		System.out.println("Tong so qua can su dung la : " + (taoDung + leDung + chanhDung) 
				+ " (Chanh : " + chanhDung + ", Tao : " + taoDung + ", Le : " + leDung + ")");
		
		input.close();
	}
}
