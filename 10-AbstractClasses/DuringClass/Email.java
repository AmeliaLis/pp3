public class Email extends Message {
    private String messageSubject;
    private String recipitentAdress;

    public String getMessageSubject() {
        return messageSubject;
    }
    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }
    public String getRecipitentAdress() {
        return recipitentAdress;
    }
    public void setRecipitentAdress(String recipitentAdress) {
        this.recipitentAdress = recipitentAdress;
    }

    Email(String text, String messageSubject, String reipitentAdress){
        super(text);
        this.messageSubject=messageSubject;
        this.recipitentAdress=reipitentAdress;
    }

    public void send(){
        System.out.println("Email: " + getText());
    }
}
