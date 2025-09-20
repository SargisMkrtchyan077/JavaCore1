package homework.homework1;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 7, 7, 15, 15, 8, 9, 10};
        int n = 6;
        int count = 0;
        for (int num : numbers) {
            if (num == n) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("------");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("------");

        int duplicateCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateCount++;
                }
            }

        }
        System.out.println(duplicateCount);
        System.out.println("-----");

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        char[] vowel = {'ա', 'է', 'ը', 'ի', 'օ', 'ո'};

        int num = 0;
        for (char c : chars) {
            for (char c1 : vowel) {
                if (c == c1) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
