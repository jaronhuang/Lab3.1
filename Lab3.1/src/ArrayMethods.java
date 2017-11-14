/**
 * ArrayMethods Lab 3.1
 * @author Jaron Huang
 * Period 6 - 7
 * Created on: 11/14/17
 */
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] numList = new int[]{0, 1, 2, 3, 4, 5, 6, 11, 13, 13, 11, 13, 3, 2, 1, 0, 4, 3, 2, 11, 13, 0, 2, 4, 1, 5, 6};
		
		int[] num1 = new int[] {1, 7, 9, 11};
		int[] num2 = new int[] {2, 6, 8, 10};
		
		System.out.println("Pascal Triangle:");
		printPascalTriangle(pascalTriangle(4));
		System.out.println("Product Array:");
		printArray(productArray(num1, num2));
		System.out.println("Remove Duplicates:");
		printArray(removeDuplicates(numList));
	}
	
	/**
	 * Removes duplicates from a given array
	 * @param list An array of numbers
	 * @return A new list with the unique numbers of the original array
	 */
	public static int[] removeDuplicates(int[] list)
	{
		int[] result;
		result = new int[countUnique(list)];
		
		int count = 0;
		for (int i = 0; i < list.length; i++)
		{
			boolean isDup = false;
			for (int j = i + 1; j < list.length; j++)
			{
				if (list[i] == list[j])
				{
					isDup = true;
				}
			}
			if (!isDup)
			{
				result[count] = list[i];
				count++;
			}
		}
		
		return result;
	}
	
	/**
	 * Multiplies each element in the first array with each element in the second array
	 * @param arr1 An array of numbers
	 * @param arr2 An array of numbers
	 * @return returns a multidimensional array containing the product of each combination of elements.
	 */
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
	
	/**
	 * Prints out a pascal triangle with any number of rows
	 * @param n Amount of rows the pascal triangle contains
	 * @return Returns a two-dimensional “jagged” array holding n-rows of Pascal’s triangle.
	 */
	public static int[ ][ ] pascalTriangle(int n)
	{
		int[][] result = new int[n][];
		
		for (int i = 0; i < n; i++)
		{
			result[i] = new int[i + 1];
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
	
	/**
	 * Arranges the Pascal Triangle into a triangle
	 * @param pTriangle Pascal Triangle Array
	 */
	public static void printPascalTriangle(int[ ][ ] pTriangle)
	{
		for (int i = 0; i < pTriangle.length; i++)
		{
			for (int j = 0; j < pTriangle.length - i; j++)
			{
				System.out.print("  ");
			}
			for (int k = 0; k < pTriangle[i].length; k++)
			{
				System.out.print("[" + pTriangle[i][k] + "] ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array that is being printed out
	 */
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	/**
	 * Prints out each element a multidimensional array
	 * @param arr Array that is being printed out
	 */
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
	
	/**
	 * Finds how many unique elements are in a given array
	 * @param numbers Array of numbers
	 * @return Returns the number of unique elements
	 */
	public static int countUnique(int[] numbers)
	{
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			boolean unique = true;
			
			for (int j = i + 1; j < numbers.length; j++)
			{
				if (numbers[i] == numbers[j])
				{
					unique = false; 
					break; 
				}
			}
			
			if(unique)
			{
				count++;
			}
		}
		return count;
	}
}
