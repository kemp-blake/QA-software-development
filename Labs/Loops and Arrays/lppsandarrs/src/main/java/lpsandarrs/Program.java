package lpsandarrs;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        int zeroIndex = 0;
        int i = 0;
        for(int number : numbers) {
            sum = sum + number;
            if (max < number) { max = number; }
            if (min > number) { min = number; }
            if (number == 0) { zeroIndex = i; }
            i++;
        }
        System.out.printf("Sum: %d%nMax: %d%nMin: %d%nIndex of Zero: %d%n", sum, max, min, zeroIndex);
    }

    public static String getGrade(int mark) {
        return "test";



    }
}