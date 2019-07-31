import java.util.Random;

public class ArrayConfig {
    private static Random random = new Random();


    static void fillRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(50);
        }
    }

    static void printReflection(int[] array) {
        int x = 1;
        for (int i = 0; i < array.length * 2; i++) {
            if(i < array.length) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i - x] + " ");
                x += 2;
            }
        }
    }
}
