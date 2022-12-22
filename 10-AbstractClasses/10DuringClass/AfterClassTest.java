public class AfterClassTest {
    public static void main(String[] args) {

        SMS phoneNumberUser1 = new SMS("123456789");
        Email emailUser1 = new Email("user1IsTheBest@gmail.com");

        User user1 = new User("Jan", "Kowalski", phoneNumberUser1, emailUser1);

        user1.emailUser.setText("Hello World");
        user1.emailUser.setMessageSubject("Greeting");
        user1.emailUser.setRecipitentAdress("friendOfUser1@gmail.com");
        user1.emailUser.send();

        user1.phoneNumber.setText("What's up?");
        user1.phoneNumber.send();
    }
}
