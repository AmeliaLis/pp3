public class Student {
    
    //Wykaz atrybutów
    String name;
    int wiek;
    String studentIdCard;
    boolean isValid;
    int semester;
    double averageGrade;
    
    
    //Wykaz metod
    
    public void sayHello() {
        System.out.println("Hello everyone");
    };
    
    public void displayName() {
        System.out.println("My name is " + name);
    };
    
    public void displayAge() {
        System.out.println("My age is " + wiek);
    };
    
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("Average grade: " + averageGrade);
    }
    
    public void changeStatus() {
        isValid = !isValid;
    }
    
    public void displayInfoId() {
        System.out.println("Name: " + name);
        System.out.println("Is valid?: " + isValid);
        System.out.println("Student ID card: " + studentIdCard);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amelia";
        s1.wiek = 20;
        s1.studentIdCard = "221423";
        s1.isValid = true;
        s1.semester = 3;
        s1.averageGrade = 4.78;
        s1.displayInfoId();
        s1.changeStatus();
        s1.displayInfoId();
        s1.displayStudentInfo();
    }
} 