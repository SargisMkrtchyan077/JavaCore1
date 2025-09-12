package homework.homework1;

public class FigurePainters {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("\n");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = -i; j < -1; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 2; i <= 6; i++) {
            for (int j = -i; j < -1; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}