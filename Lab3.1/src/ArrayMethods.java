
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] numList = {1, 3, 5, 6, 1};
		System.out.println(removeDuplicates(numList));
	}
	
	public static int removeDuplicates(int[] list)
	{
		int[] cList;
		int c = 0;
		int count = 0;
		
		for (int i = 0; i < list.length - 1; i++)
		{
			for (int j = 1; j < list.length; j++)
			{
				if (list[i] != list[j])
				{
					c++;
				}
				
				if (c == (list.length - j))
				{
					count++;
					c = 0;
				}
			}
		}
		
		return count;
		
		/*cList = new int[count];
		int h = 0;
		int hold = 0;
		for(int i = 0; i < list.length - 1; i++)
		{
			for(int j = 1; j < list.length; j++)
			{
				if (list[i] != list[j])
				{
					h++;
				}
				
				if (h == (list.length - j))
				{
					cList[hold] = list[i];
					hold++;
					h = 0;
				}
			}
		}
		
		return cList;*/
	}
	
	//public static int[][] productArray(int[] arr1, int[] arr2)
	{
	
	}
	
	//public static int[ ][ ] pascalTriangle(int n)
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
}
