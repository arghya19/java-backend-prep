package com.example.practice.day3;import java.awt.image.RescaleOp;

public class ArrayPractice {

//	14. Find the frequency of each element.
//	15. Remove duplicates from an array.
//	16. Move all zeros to the end.
//	17. Rotate an array left by one position.
//	18. Rotate an array right by one position.
//	19. Check whether an array is sorted.
//	20. Merge two arrays.

	
//	Interview-Level
//	21. Find the missing number from 1 to n.
//	22. Find the element that appears only once.
//	23. Find duplicate elements.
//	24. Find two numbers whose sum equals a target.
//	25. Find the maximum subarray sum.
//	26. Find the intersection of two arrays.
//	27. Find the union of two arrays.
//	28. Rotate an array by k positions.
//	29. Solve an array problem using the two-pointer technique.
//	30. Solve an array problem using prefix sums.
	
	
	static void declareArray() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5 };
		printArray(numbers);
	}

	static void printArray(int[] num) {
//		1. Create an array and print all elements.
		for (int i : num) {
			System.out.println(i);
		}
	}

	static int arraySum(int[] arr) {
//		2. Find the sum of all elements.
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	static double arrayAverage(int[] arr) {
//		3. Find the average.
		double avg = 0.0;
		avg = arraySum(arr) / arr.length;
		return avg;
	}

	static int arrayMaxElement(int[] arr) {
//		4. Find the maximum element.
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	static int arrayMinElement(int[] arr) {
//		5. Find the minimum element.
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	static boolean searchArrayElement(int[] arr, int target) {
//		6. Search for a given element.
		boolean flag = false;
		for (int i : arr) {
			if (i == target) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	static void arrayEvenOddCount(int[] arr) {
//		7. Count even and odd numbers.
		int even = 0, odd = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

	}

	static void arrayPositiveNegetiveCount(int[] arr) {
//		8. Count positive and negative numbers.
		int positiveNumber = 0, negetiveNumber = 0;
		for (int i : arr) {
			if (i > 0) {
				positiveNumber++;
			} else if (i < 0) {
				negetiveNumber++;
			} else {
				positiveNumber++;
			}
		}
		System.out.println("Positive Number: " + positiveNumber);
		System.out.println("Negetive Number: " + negetiveNumber);
	}

	static int[] reverseArray(int[] arr) {
//		9. Reverse an array.(Two Pointer)
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		return arr;
	}

	static void copyArray(int[] arr) {
//		10. Copy one array into another.
		int[] numbers = new int[arr.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = arr[i];
		}

		printArray(numbers);
	}
	
	static int arraySecondLargest(int[] arr) {
//		11. Find the second-largest element.
		int largest = arr[0], secondLargest = 0;
		for(int n : arr) {
			if(n > largest) {
				secondLargest = largest;
				largest = n;
			}else if(n < largest && n > secondLargest) {
				secondLargest = n;
			}
		}
		return secondLargest;
	}

	static int arraySecondSmallest(int[] arr) {
//		12. Find the second-smallest element.
		int smallest = arr[0],secondSmallest = 0;
		for(int n : arr) {
			if(n < smallest) {
				secondSmallest = smallest;
				smallest = n;
			}else if(smallest < n && n > secondSmallest) {
				secondSmallest = n;
			}
		}
		return secondSmallest;
	}
	
	static void countDuplicates(int[] num) {
//		13. Count duplicate elements.
		
	}
	
	public static void main(String[] args) {

		int[] num = {2,3,2,4,4,5,6,6,6};
	}

}
