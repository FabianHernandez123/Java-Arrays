package dataStructures2;

import java.util.Arrays;

public class Main {
	static void sumArray(Integer[] examples) {
		Integer addedUp = 0;
		for(Integer example: examples) {
			addedUp += example;
		}
		System.out.printf("the sum is %d\n", addedUp);
	}
	public static int[] toPower(int size, int power) {
		int powerArray[] = new int[size];
			for (int j = 0; j< size; j++) {
				powerArray[j]=(int) Math.pow(j, power);	
			}
		return powerArray;
		
	}

	public static void main(String[] args) {
		//calling sumArray method
		Integer[] example1 = {5,1};
		sumArray(example1);
		
		//trying given code
		double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];

        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
                  System.out.printf("%d, %d\n",(int)exampleArray[i],(int)index);
             }
        }
        //System.out.println(index);
		
        
        //printing the toPower method to see if it works. 
        System.out.println(Arrays.toString(toPower(4, 2)));
		
		
		
	}

}
