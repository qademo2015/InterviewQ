import java.util.Random;

/**
 * Created by abarabash on 2/9/16.
 */
public class RussianRoulette {

    public static void main(String[] args) {

        int shots = 0;

        int[] cylinder = new int[]{0, 0, 0, 0, 0, 1};

        int numberOfTimes = 0;

        while(numberOfTimes++ < 600000) {
            Random random = new Random();
            int hole = random.nextInt(6);
            if (cylinder[hole] == 1){
                shots++;
            }
        }

        System.out.println("we made " + shots + " shots");
    }
}
