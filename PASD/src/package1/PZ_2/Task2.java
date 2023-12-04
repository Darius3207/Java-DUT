package package1.PZ_2;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int[] numbers = {74, 85, 85, 85, 101, 85, 56};
        System.out.print("Введіть число k: ");
        int k = scanner.nextInt();

        int[] allIndexes = allIndexesOf(numbers, k);
        
        if (allIndexes != null) {
            System.out.println("Індекси числа " + k + " в масиві: " + Arrays.toString(allIndexes));
        } else {
            System.out.println("Число " + k + " не знайдене в масиві.");
        }
	}
	
	public static int[] allIndexesOf(int[] numbers, int k) {
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        int[] indexes = new int[count];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                indexes[index++] = i;
            }
        }

        return indexes;
    }
}
	
	
