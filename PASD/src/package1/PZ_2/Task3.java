package package1.PZ_2;

public class Task3 {

	public static void main(String[] args) {
		double[] array1 = {16.1, 12.3, 22.2, 14.4};
        double[] array2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

        boolean isArray1Sorted = isSorted(array1);
        boolean isArray2Sorted = isSorted(array2);
        
        System.out.println("array1 відсортований: " + isArray1Sorted);
        System.out.println("array2 відсортований: " + isArray2Sorted);

	}
	
	 public static boolean isSorted(double[] array) {
	        if (array.length == 1) {
	            return true;
	        } else if (array.length == 0) {
	            return false;
	        }

	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i + 1]) {
	                return false; 
	            }
	        }

	        return true; 
	    }

}
