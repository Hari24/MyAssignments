package week2.day2;
import java.util.*; // Import for utility classes like Arrays and ArrayList

public class LearnArrays {

	public static void main(String[] args) {
		

	
		        // 1. Declare and initialize an array
		        int[] numbers = {5, 2, 9, 1, 6};
		        System.out.println("Original Array:");
		        printArray(numbers);

		        // 2. Sorting the array
		        Arrays.sort(numbers);
		        System.out.println("\nSorted Array:");
		        printArray(numbers);

		        // 3. Searching for an element (binary search requires sorted array)
		        int key = 9;
		        int index = Arrays.binarySearch(numbers, key);
		        if (index >= 0) {
		            System.out.println("\nElement " + key + " found at index: " + index);
		        } else {
		            System.out.println("\nElement " + key + " not found in the array.");
		        }

		        // 4. Demonstrating multidimensional arrays
		        int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        System.out.println("\n2D Array (Matrix):");
		        print2DArray(matrix);

		        // 5. Dynamic resizing using ArrayList
		        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
		        System.out.println("\nOriginal ArrayList:");
		        System.out.println(fruits);

		        // Adding elements
		        fruits.add("Date");
		        fruits.add("Elderberry");
		        System.out.println("\nArrayList after adding elements:");
		        System.out.println(fruits);

		        // Removing an element
		        fruits.remove("Banana");
		        System.out.println("\nArrayList after removing 'Banana':");
		        System.out.println(fruits);

		        // Converting ArrayList back to array
		        String[] fruitsArray = fruits.toArray(new String[0]);
		        System.out.println("\nConverted back to Array:");
		        printArray(fruitsArray);
		        
		        
		        int[] num = {1, 3, 5, 7, 9, 11};

		        // Search for an element that exists
		        int index1 = Arrays.binarySearch(num, 7);
		        System.out.println("Index of 7: " + index1); // Output: 3

		        // Search for an element that does not exist
		        int notFound = Arrays.binarySearch(num, 4);
		        System.out.println("Result for 4: " + notFound); // Output: -3
		        
		        System.out.println(num);
		    }

		    // Method to print a 1D array
		    private static void printArray(int[] array) {
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		    }

		    // Overloaded method to print a 1D array of Strings
		    private static void printArray(String[] array) {
		        for (String str : array) {
		            System.out.print(str + " ");
		        }
		    }

		    // Method to print a 2D array
		    private static void print2DArray(int[][] array) {
		        for (int[] row : array) {
		            for (int num : row) {
		                System.out.print(num + " ");
		            }
		            System.out.println();
		        }
		    }
		

	}


