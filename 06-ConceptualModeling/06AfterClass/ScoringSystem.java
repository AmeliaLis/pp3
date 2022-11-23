import java.util.Arrays;

public class ScoringSystem {
    public static double score;

    public static int sum(int[] array) {
        int sum=0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    public static double average(int[] array){
        Arrays.sort(array);
        double sum = sum(array);
        sum = sum - (array[0] + array[array.length-1]);

        double score = sum/3;
        return score;
    }

    public static void main(String[] args){
        System.out.println(average(new int[] {1,2,3,4,5}));
        System.out.println(average(new int[] {2,2,5,4,5}));
        System.out.println(average(new int[] {1,2,2,4,5}));
    }
}
