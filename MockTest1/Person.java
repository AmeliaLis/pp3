public class Person {
    private String name;
    private int age;

    Person(String name, int adult) {
        this.name = name;
        this.age = adult;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isAdult(){
        if (getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return getName() + "," + getAge();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anna",21);
        System.out.println(p1.getAge());
        System.out.println(p1.isAdult());
        p1.setAge(17);
        System.out.println(p1.isAdult());
        System.out.println(p1.toString());
    }
}