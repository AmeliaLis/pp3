public class SurfaceArea
{
        
    public static double AreaCircle(int radius) {
        double AreaCircle = radius * radius * 3.14;
        return AreaCircle;
    }
    
    public static double AreaRectangle(int recX, int recY) {
        return recX*recY;
    }
    
    public static double AreaTriangle(int baseTriangle, int heightTriangle) {
        return baseTriangle * heightTriangle * 0.5;
    }
    
    public static void main(String[] args) {
        double areaRectangle = AreaRectangle(4,5);
        double areaCircle = AreaCircle(3);
        double areaTriangle = AreaTriangle(3,4);
        
        System.out.println(areaRectangle);
        System.out.println(areaCircle);
        System.out.println(areaTriangle);
    }
}
