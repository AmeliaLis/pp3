import java.util.ArrayList;


public class Family {

    private ArrayList<Person > persons = new ArrayList<Person>();
    private int adults;


    public void add(Person p) {
        this.persons.add(p);
    }

    public int adults() {
        for (Person person : this.persons) {
            if (person.getAge() >= 18) {
                this.adults +=1;
            }
        }
        return this.adults;
    }

    public static void main(String[] args) {
        Person p1 = new Person("a", 20);
        Person p2 = new Person("k", 17);
        Person p3 = new Person("a", 43);

        Family f = new Family();

        f.add(p1);
        f.add(p2);
        f.add(p3);

        System.out.println(f.adults());
    }
}
