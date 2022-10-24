public class Counter {
    int value = 0;
    int initial_value = value;

    public void IncreaseByOne() {
        value += 1;
    }

    public void DecreaseByOne(){
        value -= 1;
    }

    public void IncreaseByTen() {
        value += 10;
    }

    public void DecreaseByTen() {
        value += 10;
    }

    public void Reset(){
        value = initial_value;
    }

    public void DisplayInfo() {
        System.out.println(value);
        System.out.println(initial_value);
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.DisplayInfo();
        counter1.value = 23;
        counter1.DisplayInfo();
        counter1.IncreaseByOne();
        counter1.DisplayInfo();
        counter1.DecreaseByTen();
        counter1.DisplayInfo();
        counter1.Reset();
        counter1.DisplayInfo();

        Counter counter2 = new Counter();
        counter2.value = -47;
    }
}
