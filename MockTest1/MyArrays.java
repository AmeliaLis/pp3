public class MyArrays {
    
    public static int even(int[] array) {
        int numberOfEven = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]%2 == 0) {
                numberOfEven+=1;
            }
        }
        return numberOfEven;
    }

    public static int positiveOdd(int[] array) {
        int numberOfOddPositives=0;
        for (int element : array) {
            if ((element>0) && (element%2!=0)){
                numberOfOddPositives +=1;
            }
        }
        return numberOfOddPositives;
    }

    public static void main(String[] args) {
        System.out.println(MyArrays.even(new int[] {2,-6,5,8}));
        System.out.println(MyArrays.positiveOdd(new int[] {3,2,-5,4,1,-7}));
    }
}
