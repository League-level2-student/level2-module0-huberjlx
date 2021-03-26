package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] strings = {"string", "another string", "a third string", "a fourth string", "last string"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "a 3rd string";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i ++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int [] ints = new int[50];

		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int j = 0; j < ints.length; j++) {
			ints[j] = rand.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int minNum = ints[0];
		int maxNum = ints[0];
		for (int newInteger : ints) {
			if (newInteger < minNum) {
				minNum = newInteger;
			}
			else if (newInteger > maxNum) {
				maxNum = newInteger;
			}
		}
		System.out.println(minNum);
		//9 print the entire array to see if step 8 was correct
		for (int nextInteger = 0; nextInteger < ints.length; nextInteger++) {
			System.out.println(ints[nextInteger]);
		}
		//10. print the largest number in the array.
		System.out.println(maxNum);
	}
}
