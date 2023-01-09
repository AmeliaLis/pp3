public class Filename {
    private String fileName;

    Filename(String fileName){
        this.fileName = fileName;
    }

    public String m1() {
        return this.fileName.substring(0, this.fileName.indexOf("."));
    }

    public String m2() {
        return this.fileName.substring(this.fileName.indexOf("."), this.fileName.length());
    }
    

    public static void main(String[] args) {
        Filename f = new Filename("data.csv");
        
        System.out.println(f.m1());
        System.out.println(f.m2());

    }
    
}
