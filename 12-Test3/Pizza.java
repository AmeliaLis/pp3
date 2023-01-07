public class Pizza extends Food implements Extra{
    private int size;

    Pizza(String name, int size) {
        super(name);
        this.size=size;
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public void setPrice() {
        setPrice(getSize()-10);
    }

    public float discount(){
        if (getPrice()>=30){
            return 0.05f*getPrice(); //nie jest jasno napisane, czy ta metoda powinna zwrócić sam procent, czy procent z ceny, czy cenę ostateczną
        } else {
            return getPrice();
        }
    }

    public float delivery(){
        if (getSize()<50){
            return 6;
        } else {
            return 8;
        }
    }

    public float delivery(int tip){
        return delivery()+tip;
    }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Margherita",60);
        Pizza p2 = new Pizza("Pepperoni",25);

        System.out.println("Pizza nr 1:");
        p1.setPrice();
        System.out.println(p1.delivery());
        System.out.println(p1.discount());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getSize());

        System.out.println("Pizza nr 2:");
        p2.setPrice();
        System.out.println(p2.delivery());
        System.out.println(p2.discount());
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getSize());
    }
}
