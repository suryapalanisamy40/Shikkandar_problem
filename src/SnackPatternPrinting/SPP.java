package SnackPatternPrinting;

import java.util.Scanner;

public class SPP {

	public static void main(String[] args) {
		
		Scanner scanf=new Scanner(System.in);
				System.out.print("Enter Your value: ");
				int n=scanf.nextInt();
				
				int val=1;
					int arr[][]=new int[n][n];
				for(int i=0;i<n;i++)
				{
					if(i%2==0)
					{
						for(int j=i;j<n;j++)
						{
							
							arr[j][i]= val;
							val++;
						}
					}
					else
					{
						for(int j=n-1;j>=i;j--)
						{
						 arr[j][i]= val;
						 val++;
						}
					}
					
				}
				
				
			for(int i=0;i<n;i++)
				{
				for(int j=0;j<=i;j++)
					{
							
					System.out.print(arr[i][j]+" ");
							
					}
						
						System.out.println(" ");
				}
	}

}
