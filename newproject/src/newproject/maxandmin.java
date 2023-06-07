package newproject;

public class maxandmin {

	 public static void main(String[] args) {

	 
	  int numbers[] = new int[]{25,56,23,56,84,57,87,32,76};

	
	  int min = numbers[0];
	  int max = numbers[0];

	  for (int i = 1; i < numbers.length; i++) {
	   if (numbers[i] > max)
	    max = numbers[i];
	   else if (numbers[i] < min)
	    min = numbers[i];
	  }

	  System.out.println("Largest Number is : " + max);
	  System.out.println("Smallest Number is : " + min);
	 }
	}

