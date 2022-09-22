package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = in.nextInt();
		
		int[] intSieve = new int [n-1];
		intSieve[0] = 2;
		boolean[] blnSieve = new boolean [n-1];
		
		for(int i=1;i<n-1; i++)
		{
			intSieve[i] = i + 2;
		}
		
		for(int i=1; i<n-1; i++)
		{
			blnSieve[i] = true;
		}
		
		
		for(int i=2; i<= Math.sqrt(2); i++)
		{
			if(blnSieve[i] = true)
			{
				for(int j= i*i; j <= n; j++)
				{
					blnSieve[j] = false;
				}
			}
		}

		for(int i=1; blnSieve[i]; i++)
		{
			System.out.print(blnSieve[i]);
		}
		
		
		
		
		/*for (int element: intSieve) {
			System.out.print(element);
		}
		*/
	}

}
