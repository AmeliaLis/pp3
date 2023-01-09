public class MyArrays {
    static int numberOfPositiveAndOdd;
    static double average;
    static int sum;
    static int sumOfAboveAverage;
    
    
    public static int odd(int[] array) {
        for (int element : array) {
            if ((element>0) && (element%2 != 0)) {
                numberOfPositiveAndOdd++;
            }
        }
        return numberOfPositiveAndOdd;
    }

    public static int above(int[] array) {
        for (int element : array) {
            sum+=element;
        }

        average = sum / array.length;

        for (int element : array) {
            if (element > average) {
                sumOfAboveAverage+=element;
            }
        }
        return sumOfAboveAverage;
    }

    public static void main (String[] args) {
        System.out.println(MyArrays.odd(new int[] {3,2,-5,4,1,-7}));
        System.out.println(MyArrays.above(new int[] {5,2,7,4,2}));
    }
}
