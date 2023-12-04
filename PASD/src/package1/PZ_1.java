package package1;
import java.util.Scanner;

public class PZ_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть мінімальне число: ");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне число: ");
        int max = scanner.nextInt();

        int size = max - min + 1;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = min + i;
        }

        // a) Масив чисел та їх кількість
        System.out.println("a) Масив чисел та їх кількість:");
        printArray(numbers);
        System.out.println("Кількість чисел: " + size);

        // б) Масив непарних чисел та їх кількість
        System.out.println("б) Масив непарних чисел та їх кількість:");
        int[] oddNumbers = filterOddNumbers(numbers);
        printArray(oddNumbers);
        System.out.println("Кількість непарних чисел: " + oddNumbers.length);

        // в) Масив парних чисел та їх кількість
        System.out.println("в) Масив парних чисел та їх кількість:");
        int[] evenNumbers = filterEvenNumbers(numbers);
        printArray(evenNumbers);
        System.out.println("Кількість парних чисел: " + evenNumbers.length);

        // г) Масив від'ємних чисел та їх кількість
        System.out.println("г) Масив від'ємних чисел та їх кількість:");
        int[] negativeNumbers = filterNegativeNumbers(numbers);
        if (negativeNumbers.length > 0) {
            printArray(negativeNumbers);
            System.out.println("Кількість від'ємних чисел: " + negativeNumbers.length);
        } else {
            System.out.println("Від'ємних чисел немає.");
        }

        // д) Масив додатніх чисел та їх кількість
        System.out.println("д) Масив додатніх чисел та їх кількість:");
        int[] positiveNumbers = filterPositiveNumbers(numbers);
        if (positiveNumbers.length > 0) {
            printArray(positiveNumbers);
            System.out.println("Кількість додатніх чисел: " + positiveNumbers.length);
        } else {
            System.out.println("Додатніх чисел немає.");
        }
    }

    // Функція для виведення масиву
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Функція для фільтрації непарних чисел
    public static int[] filterOddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    // Функція для фільтрації парних чисел
    public static int[] filterEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    // Функція для фільтрації від'ємних чисел
    public static int[] filterNegativeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num < 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    // Функція для фільтрації додатніх чисел
    public static int[] filterPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
