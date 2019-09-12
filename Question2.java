package hw1;
public class Question2 {
	
	public static boolean binarySearch(int[] array,int targetValue)
	{
		int rightIndex=array.length-1;
		int leftIndex=0;
		/*
		 * We will assume that every value in the array
		 * to the right of rightIndex but not including rightIndex
		 * have all been looked at. 
		 * 
		 * We will assume that every value in the array
		 * to the left of leftIndex but not including leftIndex
		 * have all been looked at.
		 */
		int count=0;
		while(leftIndex<=rightIndex)
		{
			count=count+1;
			System.out.println(count);
			int middleIndex=(rightIndex+leftIndex)/2;
			if (array[middleIndex]==targetValue)
				return true;
			else if (array[middleIndex]<targetValue)
				leftIndex=middleIndex+1;
			else 
				rightIndex=middleIndex-1;
			System.out.println("Executed");
		}
		/*
		 * You want to make sure that when the loop terminates
		 * and you are here, then you have looked at all the items
		 * in the array. What guarantees that you have looked at all 
		 * the items in the array? 
		 * a) leftIndex<rightIndex 
		 * b) leftIndex<=rightIndex
		 */
		return false;
		
	}

	public static boolean interpolationSearch(int[] a, int desiredItem)
	{
		/*
		 * TODO: You can reuse the implementation of the binary search from lecture 
		 * here. However, make sure that in interpolationSearch you do not calculate the
		 * middleIndex but instead calculate the index using the function provided to you 
		 * which is called findIndex. 
		 */
		int left = 0, right = a.length - 1;
		while(left <= right) {
			int index = findIndex(a, left, right, desiredItem);
			if(a[index] == desiredItem) {
				return true;
			} else if(a[index] < desiredItem) {
				left = index + 1;
			} else {
				right = index - 1;
			}
			System.out.println("Executed");
		}
	
	
		return false; 
	
	} 
	public static boolean linearSearch(int[] array,int targetElement)
	{
		int lengthOfArray=array.length;
		int index=0;
		/*
		 * Every value to the left of index (not including index),
		 * have been looked at. 
		 */
		
		int count=0;
		while(index<lengthOfArray)
		{
			count=count+1;
			System.out.println(count);
			if(array[index]==targetElement)
				return true;
			index=index+1;
			System.out.println("Executed");
		}
		/*
		 * Ask yourself, what must index be, after the loop terminates
		 * so that you know that you have looked at all the values of
		 * the array. 
		 * a) index==lengthOfArray
		 * b) index==lengthOfArray-1 
		 */
		return false;
	}


	/*
	 * DO NOT MODIFY THIS METHOD
	 * You must call the method findIndex inside your interpolationSearch
	 */
	private static int findIndex(int[] a, int first, int last, int desiredItem) {

		 double p = ((double)desiredItem - a[first]) / (a[last] - a[first]);
		 int index = first + (int)Math.ceil((last - first) * p);
		 
		 if (index>last)
			 return last;
		 if (index<first) {
			 return first;
		 }
		 return index;
	}



	/*
	 * You can modify the main function in any way you like, 
	 * however, we will not mark your main function.
	 */
	public static void main(String[] args) 
	{
		int a[] = {-10, -5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
					13, 14, 15, 16, 20, 34, 99, 100, 200, 10000};
		
		int firstArray[] = {1,2,3,4,5,6};
		int secondArray[] = {1,1,1,1,1,6};
		int thirdArray[] = {1,2,5,3,5,5, 10, 20, 1000, 5, 100};
		int fourthArray[] =  {0,2,3,5, 4, 8, 9, 100};
		

	
		/*
		System.out.println("Searching the array");
		for (int element : a)
			System.out.print(element + " ");
		System.out.println();	
		*/

		/*

		if (Question2.interpolationSearch(a, 14)) 
			System.out.println("PASSES: 14 was found");
		else 
			System.out.println("FAILS: 14 was not found");

		if (Question2.interpolationSearch(a,-10)) 
			System.out.println("PASSES: -10 was found");
		else 
			System.out.println("FAILS: -10 was not found");

		if (Question2.interpolationSearch(a, 10000)) 
			System.out.println("PASSES: 10000 was found");
		else 
			System.out.println("FAILS: 10000 was not found");

		if (Question2.interpolationSearch(a, 200)) 
			System.out.println("PASSES: 200 was found");
		else 
			System.out.println("FAILS: 200 was not found");

		if (Question2.interpolationSearch(a, 23456)) 
			System.out.println("FAILS: 23456 was found");
		else 
			System.out.println("PASSES: 23456 was not found");

		if (Question2.interpolationSearch(a, -6)) 
			System.out.println("FAILS: -6 was found");
		else 
			System.out.println("PASSES: -6 was not found");

		if (Question2.interpolationSearch(a, 35)) 
			System.out.println("FAILS: 35 was found");
		else 
			System.out.println("PASSES: 35 was not found");
			*/
	} 
} 

/*
The expected output from the main function must be as follows: 


Searching the array
-10 -5 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 20 34 99 100 200 10000 

PASSES: 14 was found
PASSES: -10 was found
PASSES: 10000 was found
PASSES: 200 was found
PASSES: 23456 was not found
PASSES: -6 was not found
PASSES: 35 was not found
*/