public class Numbers {
    public static int sum_of_positives;
    public static int sum_of_negatives;
    public static boolean m(int[] numbers){
        for (int number : numbers) {
            if (number >=0) {
                sum_of_positives += number;
            } else {
                sum_of_negatives += number * (-1);
            }
        }

        if (sum_of_positives > sum_of_negatives) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {9,0,2,-7,4,-9,1,-5};
        System.out.println(Numbers.m(n1));
    }
}