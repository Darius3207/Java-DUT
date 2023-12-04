package package1.PZ_2;

public class Task5 {

	public static void main(String[] args) {
        int[] array = {5, 4, 2, 11, 9, 10, 4, 7, 3};
        evenBeforeOdd(array);
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void evenBeforeOdd(int[] array) {
        int evenIndex = 0;
        int oddIndex = array.length - 1;

        while (evenIndex < oddIndex) {
            // Знаходимо перший непарний елемент з початку
            while (evenIndex < array.length && array[evenIndex] % 2 == 0) {
                evenIndex++;
            }

            // Знаходимо перший парний елемент з кінця
            while (oddIndex >= 0 && array[oddIndex] % 2 != 0) {
                oddIndex--;
            }

            // Обмін значень, якщо є ще елементи для обробки
            if (evenIndex < oddIndex) {
                int temp = array[evenIndex];
                array[evenIndex] = array[oddIndex];
                array[oddIndex] = temp;
            }
        }
    }
}
