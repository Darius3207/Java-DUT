package package1.PZ_2;

public class Task4 {

	public static void main(String[] args) {
		int[] array = {27, 15, 15, 11, 27};
        int result = mode(array);
        
        if (result != -1) {
            System.out.println("Значення, яке зустрічається найчастіше: " + result);
        } else {
            System.out.println("Масив порожній, повертаємо -1.");
        }

	}
	
	public static int mode(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int[] frequencies = new int[101]; 
        for (int i = 0; i < array.length; i++) {
            frequencies[array[i]]++;
        }

        int modeValue = 0;
        int maxFrequency = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                modeValue = i;
            }
        }

        return modeValue;
    }

}
