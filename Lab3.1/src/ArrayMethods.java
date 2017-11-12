
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] numList = new int[]{1, 3, 5, 6, 1};
		
		int[] num1 = new int[] {1, 7, 9, 11};
		int[] num2 = new int[] {2, 6, 8, 10};
		
		printArray(pascalTriangle(5));
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		
	}
	
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int[][] result = new int[arr1.length][arr2.length];
		
		for (int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				result[i][j] = arr1[i]*arr2[j];
			}
		}
		return result; 
	}
	
	public static int[ ][ ] pascalTriangle(int n)
	{
		int[][] result = new int[n][];
		
		for (int i = 0; i < n; i++)
		{
			result[i] = new int[i+1];
			for (int j = 0; j < i + 1; j++)
			{
				if (j == 0 || j == i)
				{
					result[i][j] = 1;
				}
				else
				{
					result[i][j] = result[i-1][j-1] + result[i-1][j];
				}
			}
		}
		return result;
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
