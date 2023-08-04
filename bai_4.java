package bai_tap_buoi_1;

import java.util.Scanner;

public class bai_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap so a : ");
		int a = input.nextInt();
		
		System.out.println("Nhap so b : ");
		int b = input.nextInt();
		
		System.out.println("Nhap so c : ");
		int c = input.nextInt();
		
		if( a == 0 && b == 0 )
			System.out.println("Phuong trinh vo nghiem ! ");
		
		else if( a == 0 && c == 0 )
			System.out.println("Phuong trinh co nghiem duy nhat : " + 0);
		
		else
		{
			double denta = Math.pow(b, 2) - 4 * a * c;
			
			if( denta < 0)
				System.out.println("Phuong trinh vo nghiem !");
			
			else if( denta == 0 )
			{
				double nghiem = (-b / (2 * a));
				
				if( nghiem > 0 )
					System.out.println("Phuong trinh co nghiem : \nx1 = x2 = " + (Math.sqrt(nghiem)) + ("\nx3 = x4 = ") + (-Math.sqrt(nghiem)));
				
				else
					System.out.println("Phuong trinh vo nghiem !");
			}
			
			else
			{
				double nghiem1 = ( -b + Math.sqrt(denta) ) / (2 * a ), nghiem2 = ( -b - Math.sqrt(denta) ) / (2 * a );
				
				if( nghiem1 > 0 )
					System.out.println("Phuong trinh co nghiem : \nx1 = " + Math.sqrt(nghiem1) + "\nx2 = " + (- Math.sqrt(nghiem1)));
				
				if (nghiem2 > 0)
					System.out.println("x3 = " + Math.sqrt(nghiem2) + "\nx4 = " + (- Math.sqrt(nghiem2)));
				
				if ( nghiem1 < 0 && nghiem2 < 0 )
					System.out.println("Phuong trinh vo nghiem !");
			}
		}
		
		input.close();
	}

}
