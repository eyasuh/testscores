import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] intArr  = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        int min;
        int max = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a score (" +i + "/10): ");
            intArr[i-1] = input.nextInt();
            total += intArr[i-1];

        }


        double avg = total/10;
        System.out.println("All the scores are" + Arrays.toString(intArr) + avg + " " + max);
    }
}
