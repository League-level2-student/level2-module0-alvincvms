package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] string = {"a","b","c","d","e"};
		//2. print the third element in the array
		System.out.println(string[2]);
		//3. set the third element to a different value
		string[2] = "x";
		//4. print the third element again
		System.out.println(string[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		
		//6. make an array of 50 integers
		int[] num = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < num.length; i++) {
			num[i] = new Random().nextInt(100)+1;
		}
		//8. without printing the entire array, print only the smallest number in the array
		Arrays.sort(num);
		System.out.println(num[0]);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
		}
		//10. print the largest number in the array.
		System.out.println(num[49]);
	}
}
