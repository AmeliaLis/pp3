public class Car extends Vehicle{
    private String bodyType;

    Car(String brand, String model, int wheels,int doors,String bodyType){
        super(brand, model, wheels, doors);
        this.bodyType = bodyType;
    }

    public void drive(){
        System.out.println("The car has started driving!");
    }

    public void stop(){
        System.out.println("The car has stopped driving.");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("The body type of the car is: " + getBodyType());

    }

}
