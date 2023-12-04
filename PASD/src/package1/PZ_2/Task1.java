package package1.PZ_2;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = {74, 85, 85, 85, 101, 85, 56};
		System.out.print("Введіть число k: ");
        int k = scanner.nextInt();

        int lastIndex = lastIndexOf(numbers, k);
        
        if (lastIndex != -1) {
            System.out.println("Останній індекс числа " + k + " в масиві: " + lastIndex);
        } else {
            System.out.println("Число " + k + " не знайдене в масиві.");
        }
	}
	
	public static int lastIndexOf(int[] numbers, int k) {
        int lastIndex = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

}

