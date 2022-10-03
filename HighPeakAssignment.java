package javaPack;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HighPeakAssignment 
{
	static int minimum(int [] price, int n,int k)
	{
		int result = Integer.MAX_VALUE;
		Arrays.sort(price);
		for(int i = 0; i <= n-k; i++)
			result = Math.min(result, price[i + k -1] - price[i]);
		return result;
	}
	
	static int getting(int res, int price[], int n,int k)
	{
		int result = Integer.MAX_VALUE;
		for(int i = 0; i <= n; i++)
		{
			result = Math.min(result,  price[i + k -1] - price[i]);
			if(res == result)
				return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException
	{
		int price[] = 
			{
					7980,22349,999,2799,229900,11101,9999,2195,9800,4999
			};
			
		String goodies[] = 
			{
					"Fitbit Plus : 7980",
					"IPods : 22349",
					"MI Band : 999",
					"Cult Pass : 2799",
					"Macbook Pro : 229900",
					"Digital Camera : 11101",
					"Alexa : 9999",
					"Sandwich Toaster : 2195",
					"Microwave Oven : 9800",
					"Scale : 4999"
			};
		
		int n = price.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees : ");
		int k = sc.nextInt();
		int result = minimum(price, n, k);
		System.out.println("Number of Employees : " +k);
		int start = getting(result, price, n, k);
		System.out.println("Here the input goodies that are selected for distribution are : ");
		for(int i=start; i<start+k;i++)
			System.out.println(goodies[i]);
		System.out.println("And the differce between the choosen goodie with highest "
				+ "price and the lowest price is : "+result);
		
		
	}

}
