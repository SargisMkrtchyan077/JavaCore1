package homework.homework1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n" + "------");

        System.out.println(numbers[0]);

        System.out.println("------");

        System.out.println(numbers.length + -1);

        System.out.println("------");

        System.out.println(numbers.length);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("------");
        System.out.println(min);

        System.out.println("-------");

        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        }
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]);
        }
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[numbers.length / 2]);
        }


        System.out.println("-------");

        int evencount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evencount++;
            }
        }
        System.out.println("զույգերը " + evencount);

        System.out.println("------");

        int oddcount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println("կենտերը " + oddcount);
        System.out.println("------");

        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }
        System.out.println("գումարը " + num);

        System.out.println("------");

        double average = (double) num / numbers.length;
        System.out.println("average " + average);

        System.out.println("------");
    }
}
