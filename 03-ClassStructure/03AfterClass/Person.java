public class Person {
    String name;
    double weight;
    double height;
    double BMI;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        this.BMI = (this.weight)/((this.height/100)*(this.height/100));
    }

    public void displayRecord() {
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
        System.out.println("BMI: " + this.BMI);

        if (this.BMI < 18.5) {
            System.out.println("BMI is too LOW");
        } else if (this.BMI > 24.9) {
            System.out.println("BMI is too HIGH");
        } else {
            System.out.println("BMI is correct");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kate", 0, 0 );
        Person p2 = new Person("Amelia", 58, 169 );
        Person p3 = new Person("Mary", 26, 150 );
        
        p1.setWeightAndHeight(150, 200);

        p1.calculateBMI();        
        p2.calculateBMI();
        p3.calculateBMI();

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }
}   