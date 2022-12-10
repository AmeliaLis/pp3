public class Arrays {
    public int[] arr1;
    public int[] arr2;
    
    public static int numberOfTwoDigitsARR1;
    public static int numberOfTwoDigitsARR2;

    public static boolean arr(int[] arr1, int[] arr2){

        for (int i=0; i<arr1.length;i++){
            if((arr1[i] > 9 && arr1[i]<100) || (arr1[i]>-100 && arr1[i]<-9)){
                numberOfTwoDigitsARR1 += 1;
            }
        }

        for (int i=0; i<arr2.length;i++){
            if((arr2[i] > 9 && arr2[i]<100) || (arr2[i]>-100 && arr2[i]<-9)){
                numberOfTwoDigitsARR2 += 1;
            }
        }

        if (numberOfTwoDigitsARR1 == numberOfTwoDigitsARR2){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,-90,5};

        System.out.println(arr(arr1, arr2));
    }
}
