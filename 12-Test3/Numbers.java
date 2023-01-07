public class Numbers {
    private int[] array;

    Numbers(int[] array){
        this.array=array;
    }

    public boolean ok() {
        for (int i=1; i<array.length; i+=2){
            if(this.array[i]%2 != 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(new int[] {6,7,6,1,4});
        Numbers n2 = new Numbers(new int[] {2,5,2,8,4});

        System.out.println(n1.ok());
        System.out.println(n2.ok());
    }
}
