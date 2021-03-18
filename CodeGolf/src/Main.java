import sierpinskitriangle.Sierpinski;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static final String CHAR = "▲";

    public static void main(String[] args) {
        int[][] matrix = new Sierpinski().generateFor(4);
        Arrays.stream(matrix)
                .forEach(x -> {
                    IntStream.of(x).forEach(y -> {
                        if (y == 1) {
                            print();
                        } else {
                            space();
                        }
                    });
                    newLine();
                });
    }

    private static void newLine() {
        System.out.println();
    }

    private static void print() {
        print(CHAR);
    }

    private static void space() {
        print(" ");
    }

    private static void print(String character) {
        System.out.print(character);
    }
}
