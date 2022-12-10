public class Publisher {
    private String namePublisher;
    private String city;
    
    public String getNamePublisher() {
        return namePublisher;
    }
    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Publisher(String namePublisher, String city) {
        this.namePublisher = namePublisher;
        this.city = city;
    }

    public void display(){
        System.out.println("Name: " + getNamePublisher());
        System.out.println("City: " + getCity());
    }

}
