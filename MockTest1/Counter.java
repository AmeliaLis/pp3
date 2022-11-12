public class Counter {
    int initialValue = 0;

    public void increase() {
        initialValue+=1;
    }

    public void decrease(){
        initialValue-=1;
    }

    public void increase(int n){
        initialValue+=n;
    }

    public void decrease(int n){
        initialValue-=n;
    }

    public int value(){
        return this.initialValue;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }
}
