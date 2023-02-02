package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            if (i <= height / 2) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < height - (i - 1) * 2; j++) {
                    System.out.print(8);
                }
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
            } else {
                int spaces = 0;
                for (int j = height - i; j > 0; j--) {
                    System.out.print(" ");
                    spaces++;
                }
                for (int j = height - spaces * 2; j > 0; j--) {
                    System.out.print(8);
                }for (int j = height - i; j > 0; j--) {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        new Hourglass().printHourglassOfGivenSize(7);
    }
}
