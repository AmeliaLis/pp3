public class SuperCounter extends Counter {

    public SuperCounter(int initialValue){
        super(initialValue);
    }
    
    public void addN(int n){
        //gdyby counter mial ustawiony atrybut na protected, to rozwiazanie by zadzialalo
        //int currentCounter = super.getCounter();
        //super.counter = currentCounter+n;
        int i=0;
        while(i<n) {
            add1();
            i++;
        }
    }

    public static void main(String[] args) {
        SuperCounter s1= new SuperCounter(5);
        s1.addN(7);
        System.out.println(s1.getCounter());
    }
}
