package dataStructures2;

public class Main {
	static void sumArray(Integer[] examples) {
		Integer addedUp = 0;
		for(Integer example: examples) {
			addedUp += example;
		}
		System.out.printf("the sum is %d\n", addedUp);
	}
//	public static double[] toPower(int size, int power) {
//		
//	}

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
		
		
		
		
	}

}
