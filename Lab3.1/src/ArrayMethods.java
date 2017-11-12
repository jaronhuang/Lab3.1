
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] numList = new int[]{1, 3, 5, 6, 1};
		
		int[] num1 = new int[] {1, 7, 9, 11};
		int[] num2 = new int[] {2, 6, 8, 10};
		
		printArray(productArray(num1,num2));
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		
	}
	
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int[][] product = new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length;j++)
			{
				product[i][j] = arr1[i]*arr2[j];
			}
		}
		return product; 
	}
	
	public static int[ ][ ] pascalTriangle(int n)
	{
		
	}
	
	public static void printPascalTriangle(int[ ] [ ] triangle)
	{
		
	}
	
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	public static void printArray(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
	}
}
