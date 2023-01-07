public class Logic {
    private boolean[] array;

    Logic(boolean[] array){
        this.array=array;
    }

    public int opposite(){
        int counter=0;
        for (int i=1; i<array.length-1; i++) {
            if (array[i-1] == array[i+1]){
                counter+=1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Logic l1 = new Logic(new boolean[] {true, false, false});
        Logic l2 = new Logic(new boolean[] {true, false, true,false});
        Logic l3 = new Logic(new boolean[] {true, false, true,true,false,true,false,true,false});
        System.out.println(l1.opposite());
        System.out.println(l2.opposite());
        System.out.println(l3.opposite());
    }
}
