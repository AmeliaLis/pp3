public class SMS extends Message {

    private String phoneNumber;

    SMS(String text, String phoneNumber){
        super(text);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void send(){
        System.out.println("Phone number: " + getPhoneNumber() + ", SMS message: " + getText());
    }
}
