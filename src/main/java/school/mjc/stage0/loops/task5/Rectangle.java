package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(i == 0 || i == height - 1 ? "8"
                        : j == 0 || j == length - 1 ? "8" : " ");
            }
            System.out.println();
        }
    }
}
