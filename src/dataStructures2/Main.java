package dataStructures2;

import java.util.Arrays;

public class Main {
	static int sumArray(Integer[] examples) {
		Integer addedUp = 0;
		for(Integer example: examples) {
			addedUp += example;
		}
		return addedUp;
	}
	
	public static int[] toPower(int size, int power) {
		int powerArray[] = new int[size];
			for (int j = 0; j< size; j++) {
				powerArray[j]=(int) Math.pow(j, power);	
			}
		return powerArray;	
	}

	public static void main(String[] args) {
		//1. calling sumArray method
		Integer[] example1 = {5,1};
		System.out.println(Integer.toString(sumArray(example1)));
		
		//2. trying given code
		double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[i] > maximum) {
                  maximum = exampleArray[i];
                  index = i;
                  //System.out.printf("%d, %d\n",(int)exampleArray[i],(int)index);
                  //index stopped increasing after index two, where the element
                  //with a value of 6 was present. 
             }
        }
        System.out.println(index);
		
        
        //3. printing the toPower method to see if it works. 
        System.out.println(Arrays.toString(toPower(4, 2)));
		
		
		
	}

}
