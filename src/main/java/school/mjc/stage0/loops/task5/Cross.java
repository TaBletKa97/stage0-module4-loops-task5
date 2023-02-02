package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                System.out.print(i == Math.round((double) sideLength / 2) ? "8"
                        : j == Math.round((double) sideLength / 2) ? "8" : " "
                );
            }
            System.out.println();
        }

    }
}
