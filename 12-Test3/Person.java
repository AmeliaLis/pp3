public class Person {
    private String name;
    private String surname;

    Person(String n, String s){
        this.name=n;
        this.surname=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(){
        return this.name.substring(0,1).toUpperCase()+this.surname.substring(0, 1).toUpperCase();
    }

    public static void main(String[] args) {
        Person p1 = new Person("jan", "kowalski");
        System.out.println(p1.toString());
    }
}