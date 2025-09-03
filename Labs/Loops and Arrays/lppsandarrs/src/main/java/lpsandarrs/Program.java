package lpsandarrs;

public class Program {
    public static void main(String[] args) {

        //part 3 -mult table

        multiplicationTable();
        
        //part 2 - double your money

       // System.out.println(getYearsUntil(100, 5, 200));

        //part 2 - calculating grades
        //String[] students = {"name1", "name2", "name3", "name4", "name5"};
        //int[] grades = {50, 40, 60, 70, 20};
//
        //for(int i=0; i<students.length; i++) {
        //    System.out.printf("%s scored %d.%n%s%n",students[i],grades[i],getGrade(grades[i]));
        //};
        // part 1 getting started
        //int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
        //int sum = 0;
        //int max = numbers[0];
        //int min = numbers[0];
        //int zeroIndex = 0;
        //int i = 0;
        //for(int number : numbers) {
        //    sum = sum + number;
        //    if (max < number) { max = number; }
        //    if (min > number) { min = number; }
        //    if (number == 0) { zeroIndex = i; }
        //    i++;
        //}
        //System.out.printf("Sum: %d%nMax: %d%nMin: %d%nIndex of Zero: %d%n", sum, max, min, zeroIndex);
    }

    private static String getGrade(int mark) {
        if (mark < 50 ) {
            return "This mark is a fail.";
        } else if (mark <= 60 ) {
            return "This mark is a pass.";
        } else if (mark <= 70 ) {
            return "This mark is a merit.";
        } else {
            return "This mark is a distinction.";
        }


    }

    private static int getYearsUntil(int initial, int interest, int target) {
        int yearsUntil = 0;
        double currentValue = initial;
        while(currentValue <= target) {
            yearsUntil++;
            currentValue = currentValue+(currentValue*interest/100);
        }
        return yearsUntil;
    }

    private static void multiplicationTable(){
        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++) {
                System.out.printf("%d ",x*y);
            }
            System.out.printf("%n");
        }
    }
}