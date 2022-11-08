public class Test {
    public static void main(String[] args) {
        DrivingLicense d1 = new DrivingLicense();

        d1.setName("AMELIA");
        d1.setSurname("Lis");
        d1.setAddress("42/201");
        d1.setPostalCode("31-422");
        d1.setCity("Kraków");
        d1.setDrivingLicenseNumber("51631713");
        d1.setYearOfIssue(2020);
        d1.setCategory('B');

        d1.display();

        System.out.println(d1.toString());
    }
}
