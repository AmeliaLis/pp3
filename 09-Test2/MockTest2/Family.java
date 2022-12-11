public class Family {
    private Person[] persons;
    public int counterOfAdultPersons;

    Family(Person[] persons){
        this.persons = persons;
    }

    public int adults(){
        for (Person person:persons) {
            if (person.getAge()>=18){
                counterOfAdultPersons+=1;
            }
        }
        return counterOfAdultPersons;
    }

    public static void main(String[] args) {
        Person p1=new Person("AMelia",20);
        Person p2=new Person("Kacper",17);
        Person p3=new Person("Aneta",43);

        Family f1 = new Family(new Person[]{p1,p2,p3});

        System.out.println(f1.adults());
    }
}
