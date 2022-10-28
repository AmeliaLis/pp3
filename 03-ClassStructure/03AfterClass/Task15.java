public class Task15 {
    public static int NumberOfItems(int x, int y) {
        return Math.abs(y-x) + 1;
    }

    public static int SumOfNumbers(int x, int y) {
        int sum = 0;
        while (x <= y) {
            sum += x;
            x++;
        }
        return sum;
    }

    public static double ArithmeticMean(int x, int y) {
        return (SumOfNumbers(x,y) / (NumberOfItems(x, y) + 0.0));
    }

    public static void main(String[] args){
        System.out.println(NumberOfItems(5, 10));
        System.out.println(SumOfNumbers(5, 10));
        System.out.println(ArithmeticMean(5, 10));
    }
}