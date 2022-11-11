public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private int yearOfIssue;
    private char category;

    public void display(){
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAddress());
        System.out.println(getPostalCode());
        System.out.println(getCity());
        System.out.println(getDrivingLicenseNumber());
        System.out.println(getYearOfIssue());
        System.out.println(getCategory());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public char getCategory() {
        return category;
    }

    public void setName(String name){
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber){
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public void setYearOfIssue(int yearOfIssue){
        //if ((yearOfIssue<1980) and (yearOfIssue>=2023)){
        //    this.yearOfIssue = 0;
        //}
        this.yearOfIssue = yearOfIssue;
    }

    public void setCategory(char category){
        this.category = category;
    }

    public String toString(){
        return
            "Name: " + getName() + ", Surname: " + getSurname() + "\n" 
            + "Address: " + getAddress() + " " + getPostalCode() + " " + getCity() + "\n"
            + "License info: " + getDrivingLicenseNumber() + " " + getYearOfIssue() + " " + "Category: " + getCategory();
    }
}