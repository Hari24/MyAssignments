package week2.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int arr1[] = {1,4,3,8,2,9,7,6};
		int temp=arr1.length+1;
		int sum = (temp*(temp+1))/2;

		for (int i=0;i<arr1.length;i++) {
						
			sum=sum-arr1[i];
			}
		System.out.println("Missing element in the array is : "+sum);
		}
		

	}


