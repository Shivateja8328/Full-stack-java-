package newproject;

import java.util.Arrays;

public class reverse {
	 public static void main(String[] args) {
	       int[] array = {8, 5, 3, 16, 12};
	       System.out.println("Array : " + Arrays.toString(array)); 

	    
	       int[] reversedArray = reverse(array);
	       System.out.println("Reversed array : " + Arrays.toString(reversedArray)); 
	   }

	
	   static int[] reverse(int[] array) {
	       int[] newArray = new int[array.length];

	       for (int i = 0; i < array.length; i++) {
	           newArray[array.length - 1 - i] = array[i];
	       }

	       return newArray;
	   }
}
