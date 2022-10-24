public class Rectangle {
    double height;
    double length;

    public void DisplayDimensions() {
        System.out.println("The dimentions of this rectangle are: " + height + "x" + length);
    }

    public void DisplayPerimeters() {
        double perimeter = (2 * height) + (2 * length);
        System.out.println("The perimeter of this rectangle is: " + perimeter);
    }

    public void DisplayArea() {
        double area = height * length;
        System.out.println("The area of this rectangle is: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = 3.0;
        rectangle1.length = 4.0;
        rectangle1.DisplayDimensions();
        rectangle1.DisplayPerimeters();
        rectangle1.DisplayArea();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.height = 2.0;
        rectangle2.length = 7.0;
        rectangle2.DisplayDimensions();
        rectangle2.DisplayPerimeters();
        rectangle2.DisplayArea();
    }
}
